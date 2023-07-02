package MyBookService;
import java.util.List;

public interface BookRepository {
    Book getBook(int id) throws BookNotFoundEx;
    List<Book> getAllBooks();
    boolean addBook(int id, String title, String author, double price) throws BookExistsEx;
    boolean deleteBook(int id) throws BookNotFoundEx;
    boolean updateBook(int id, String title, String author, double price) throws BookNotFoundEx;
}
