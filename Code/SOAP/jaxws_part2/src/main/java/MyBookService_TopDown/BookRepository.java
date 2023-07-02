package MyBookService_TopDown;
import MyBookService.Book;
import MyBookService.BookExistsEx;
import MyBookService.BookNotFoundEx;

import java.util.List;

public interface BookRepository {
    MyBookService.Book getBook(int id) throws MyBookService.BookNotFoundEx;
    List<Book> getAllBooks();
    boolean addBook(int id, String title, String author, double price) throws BookExistsEx;
    boolean deleteBook(int id) throws MyBookService.BookNotFoundEx;
    boolean updateBook(int id, String title, String author, double price) throws BookNotFoundEx;
}
