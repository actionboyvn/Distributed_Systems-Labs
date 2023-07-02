package MyBookService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface BookService {
    @WebMethod
    Book getBook(int id) throws BookNotFoundEx;
    @WebMethod
    List<Book> getAllBooks();
    @WebMethod
    boolean addBook(int id, String title, String author, double price) throws BookExistsEx;
    @WebMethod
    boolean deleteBook(int id) throws BookNotFoundEx;
    @WebMethod
    boolean updateBook(int id, String title, String author, double price) throws BookNotFoundEx;
}
