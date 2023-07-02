import com.google.protobuf.ByteString;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.example.model.*;

public class GrpcServer {
    public static void main(String[] args) {
        int port = 50001;
        System.out.println("Starting gRPC server...");
        MyServiceImpl myService = new MyServiceImpl("./GrpcServer/src/main/java/files/");
        Server server = ServerBuilder.forPort(port)
                .addService(myService).build();
        try {
            server.start();
            System.out.println("...Server started");
            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static class MyServiceImpl extends ServiceNameGrpc.ServiceNameImplBase {
        List<Book> book_repo;
        String folderPath;
        File folder;
        File[] listOfFiles;
        public MyServiceImpl(String folder_path) {
            book_repo = new ArrayList<>();
            Book book1 = Book.newBuilder().setId(1).setTitle("Book 1").setPages(125).setCoverPageImage("book1.jpg").build();
            Book book2 = Book.newBuilder().setId(2).setTitle("Book 2").setPages(324).setCoverPageImage("book2.jpg").build();
            Book book3 = Book.newBuilder().setId(3).setTitle("Book 3").setPages(92).setCoverPageImage("book3.jpg").build();
            book_repo.add(book1);
            book_repo.add(book2);
            book_repo.add(book3);
            folderPath = folder_path;
            folder = new File(folderPath);
            listOfFiles = folder.listFiles(x -> x.isFile());
        }
        public void saveOneBookProcedure(SaveOneBookRequest req,
                                         StreamObserver<SaveBooksResponse> responseObserver) {
            boolean check_book_exist = false;
            Book new_book = req.getNewBook();
            for (Book book : book_repo)
                if (book.getId() == new_book.getId()) {
                    check_book_exist = true;
                    break;
                }
            SaveBooksResponse response;
            if (check_book_exist) {
                response = SaveBooksResponse.newBuilder().setInformation("New book id exists. Can not save.").build();
            } else {
                book_repo.add(req.getNewBook());
                response = SaveBooksResponse.newBuilder().setInformation("New book saved.").build();
            }
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        public void saveBooksProcedure(SaveBooksRequest req,
                                       StreamObserver<SaveBooksResponse> responseObserver) {
            List<Book> new_book_repo = req.getNewBookRepo().getBookList();
            book_repo = new_book_repo;
            SaveBooksResponse response;
            response = SaveBooksResponse.newBuilder().setInformation("New list of books saved.").build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        public void readBooksProcedure(ReadBooksRequest req,
                                       StreamObserver<BookRepo> responseObserver) {
            List<Book> read_books = new ArrayList<>();
            if (req.getId() == -1)
                read_books = book_repo;
            else
                for (Book book : book_repo)
                    if (book.getId() == req.getId()) {
                        read_books.add(book);
                        break;
                    }
            BookRepo response = BookRepo.newBuilder().addAllBook(read_books).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        public void deleteOneBookProcedure(DeleteOneBookRequest req,
                                           StreamObserver<DeleteOneBookResponse> responseObserver) {
            DeleteOneBookResponse response;
            boolean book_removed = book_repo.removeIf(b -> b.getId() == req.getId());
            if (book_removed) {
                response = DeleteOneBookResponse.newBuilder().setInformation("Book deleted.").build();
            } else
                response = DeleteOneBookResponse.newBuilder().setInformation("Book id not found. Delete failed.").build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        public void bookImageStreamingProcedure(BookImageStreamingRequest req,
                                           StreamObserver<ByteResponse> responseObserver){
            Book get_book = null;
            for (Book book : book_repo)
                if (book.getId() == req.getId()) {
                    get_book = book;
                    break;
                }
            if (get_book == null) {
                Throwable t = new Throwable("Book not found");
                responseObserver.onError(t);
                return;
            }
            File file = new File(folderPath + get_book.getCoverPageImage());
            if (!file.exists()) {
                Throwable t = new Throwable("File not found");
                responseObserver.onError(t);
                return;
            }
            int BUF_SIZE = (int) (file.length() / 5);
            byte[] bytes = new byte[BUF_SIZE];
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println("File: " + get_book.getCoverPageImage() + " is being downloaded...");
            String file_name = get_book.getCoverPageImage();
            while (true) {
                try {
                    if (!(fileInputStream.read(bytes) > 0)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                ByteResponse response = ByteResponse.newBuilder()
                        .setNumOfBytes(bytes.length)
                        .setChunk(ByteString.copyFrom(bytes))
                        .setFileName(file_name).build();
                if (!file_name.equals(""))
                    file_name = "";
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
            System.out.println("File: " + get_book.getCoverPageImage() + " downloaded...");
        }
    }
}