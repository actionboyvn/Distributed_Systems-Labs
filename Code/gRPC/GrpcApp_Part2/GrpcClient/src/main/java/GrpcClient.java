import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class GrpcClient {

    public static void main(String[] args)  {
        String address = "localhost"; //here we use service on the same host
        int port = 50001;
        ServiceNameGrpc.ServiceNameBlockingStub bStub;
        ServiceNameGrpc.ServiceNameStub nonbStub;
        System.out.println("Running gRPC client...");
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(address, port) .usePlaintext().build();
        bStub = ServiceNameGrpc.newBlockingStub(channel);
        nonbStub = ServiceNameGrpc.newStub(channel);
//        DeleteOneBookRequest req = DeleteOneBookRequest.newBuilder().setId(1).build();
//        DeleteOneBookResponse response = bStub.deleteOneBookProcedure(req).next();
//        System.out.println(response.getInformation());
//
//        req = DeleteOneBookRequest.newBuilder().setId(1).build();
//        response = bStub.deleteOneBookProcedure(req).next();
//        System.out.println(response.getInformation());
        /////////////////BOOK SERVICE///////////////////////////////
        Scanner scanner = new Scanner(System.in);
        String option, request_string;
        int id, pages;
        String title, cover_page_image;
        Book new_book;
        List<Book> new_books = new ArrayList<>();
        while (true) {
            System.out.println("Select a procedure:");
            System.out.println("\t1. Save a new list of books");
            System.out.println("\t2. Save a new book");
            System.out.println("\t3. Get a book");
            System.out.println("\t4. Get all books");
            System.out.println("\t5. Delete a book");
            System.out.println("\t6. Get a book's cover page image");
            System.out.print("Your choice: ");
            option = scanner.nextLine();
            if (option == "exit")
                break;
            switch (option) {
                case "1":
                    int n;
                    System.out.print("Number of books: ");
                    n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 1; i <= n; i++) {
                      System.out.print("Book " + i + " id: ");
                      id = scanner.nextInt();
                      scanner.nextLine();
                      System.out.print("Book " + i + " title: ");
                      title = scanner.nextLine();
                      System.out.print("Book " + i + "'s number of pages: ");
                      pages = scanner.nextInt();
                      scanner.nextLine();
                      System.out.print("Book " + i + " cover page image's name: ");
                      cover_page_image = scanner.nextLine();
                      new_book = Book.newBuilder().setId(id).setTitle(title).setPages(pages).setCoverPageImage(cover_page_image).build();
                        new_books.add(new_book);
                    }
                    BookRepo new_book_repo = BookRepo.newBuilder().addAllBook(new_books).build();
                    SaveBooksRequest req = SaveBooksRequest.newBuilder().setNewBookRepo(new_book_repo).build();
                    SaveBooksResponse response = bStub.saveBooksProcedure(req).next();
                    System.out.println("Response: " + response.getInformation());
                    break;
                case "2":
                    System.out.print("New book id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("New book title: ");
                    title = scanner.nextLine();
                    System.out.print("New book's number of pages: ");
                    pages = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("New book cover page image's name: ");
                    cover_page_image = scanner.nextLine();
                    new_book = Book.newBuilder().setId(id).setTitle(title).setPages(pages).setCoverPageImage(cover_page_image).build();
                    SaveOneBookRequest req2 = SaveOneBookRequest.newBuilder().setNewBook(new_book).build();
                    SaveBooksResponse response2 = bStub.saveOneBookProcedure(req2).next();
                    System.out.println("Response: " + response2.getInformation());
                    break;
                case "3":
                    System.out.print("Book id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    ReadBooksRequest req3 = ReadBooksRequest.newBuilder().setId(id).build();
                    BookRepo read_book_repo3 = bStub.readBooksProcedure(req3).next();
                    if (read_book_repo3.getBookList().size() == 0)
                        System.out.println("Book not found.");
                    else
                        System.out.println("Read book: \n" + read_book_repo3.getBook(0));
                    break;
                case "4":
                    id = -1;
                    ReadBooksRequest req4 = ReadBooksRequest.newBuilder().setId(id).build();
                    BookRepo read_book_repo4 = bStub.readBooksProcedure(req4).next();
                    System.out.println("Read book: \n" + read_book_repo4.toString());
                    break;
                case "5":
                    System.out.print("Book id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    DeleteOneBookRequest req5 = DeleteOneBookRequest.newBuilder().setId(id).build();
                    DeleteOneBookResponse response5 = bStub.deleteOneBookProcedure(req5).next();
                    System.out.println("Response: " + response5.getInformation());
                    break;
                default:
                    System.out.print("Book id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    BookImageStreamingRequest req6 = BookImageStreamingRequest.newBuilder().setId(id).build();
                    nonbStub.bookImageStreamingProcedure(req6, new UnaryObsFileStream());

                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        }

        channel.shutdown();
    }
    private static class UnaryObsFileStream implements  StreamObserver<ByteResponse> {
        public String fileName;
        public File file;
        public int count = 1;
        public FileOutputStream fileOutputStream;
        @Override
        public void onNext(ByteResponse byteResponse) {
            if (count == 1) {
                fileName = byteResponse.getFileName();
                String filePath = "./GrpcClient/src/main/java/files/" + fileName;
                file = new File(filePath);
                try {
                    fileOutputStream = new FileOutputStream(file, false);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Downloading " + fileName + " from server...");
            }
            try {
                System.out.println("-->async unary onNext: " + count++);
                fileOutputStream.write(byteResponse.getChunk().toByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void onError(Throwable throwable) {
            System.out.println(throwable.getMessage());
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
                if (file != null)
                    file.delete();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void onCompleted() {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("-->async unary onCompleted");
        }
    }
}