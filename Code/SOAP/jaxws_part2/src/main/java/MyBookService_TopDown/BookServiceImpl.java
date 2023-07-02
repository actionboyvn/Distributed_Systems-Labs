package MyBookService_TopDown;

import MyBookService.Book;
import MyBookService.BookExistsEx;
import MyBookService.BookNotFoundEx;
import MyBookService.BookService;
import jakarta.jws.WebService;

import java.util.List;
@WebService(serviceName = "MyBookService.BookService",
        endpointInterface = "MyBookService.BookService")
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository = new BookRepositoryImpl();
    @Override
    public MyBookService.Book getBook(int id) throws MyBookService.BookNotFoundEx {
        System.out.println("...called getBook id = " + id);
        return bookRepository.getBook(id);
    }
    @Override
    public List<Book> getAllBooks() {
        System.out.println("...called getAllBooks");
        return bookRepository.getAllBooks();
    }
    @Override
    public boolean addBook(int id, String title, String author, double price) throws BookExistsEx {
        System.out.println("...called addBook, id = " + id + ", title: " + title
        + ", author: " + author + ", price = " + price);
        return bookRepository.addBook(id, title, author, price);
    }
    @Override
    public boolean deleteBook(int id) throws MyBookService.BookNotFoundEx {
        System.out.println("...called deleteBook id = " + id);
        return bookRepository.deleteBook(id);
    }

    @Override
    public boolean updateBook(int id, String title, String author, double price) throws BookNotFoundEx {
        System.out.println("...called updateBook, id = " + id + ", title: " + title
                + ", author: " + author + ", price = " + price);
        return bookRepository.updateBook(id, title, author, price);
    }
}
