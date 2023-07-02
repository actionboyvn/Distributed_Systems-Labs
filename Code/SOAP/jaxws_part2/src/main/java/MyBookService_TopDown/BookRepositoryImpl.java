package MyBookService_TopDown;

import MyBookService.Book;
import MyBookService.BookExistsEx;
import MyBookService.BookNotFoundEx;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    private List<MyBookService.Book> bookList;
    public BookRepositoryImpl() {
        bookList = new ArrayList<>();
        bookList.add(new MyBookService.Book(1, "Book1", "Hien Le", 59.99));
        bookList.add(new MyBookService.Book(2, "Book2", "Michał Kowal", 97));
        bookList.add(new MyBookService.Book(3, "Book3", "Łukasz Małecki", 199));
    }
    @Override
    public MyBookService.Book getBook(int id) throws MyBookService.BookNotFoundEx {
        for (MyBookService.Book book: bookList) {
            if (book.getId() == id)
                return book;
        }
        throw new MyBookService.BookNotFoundEx();
    }
    @Override
    public List<MyBookService.Book> getAllBooks() {
        return bookList;
    }

    @Override
    public boolean addBook(int id, String title, String author, double price) throws MyBookService.BookExistsEx {
        for (MyBookService.Book theBook: bookList) {
            if (theBook.getId() == id) {
                throw new BookExistsEx();
            }
        }
        MyBookService.Book newBook = new MyBookService.Book(id, title, author, price);
        bookList.add(newBook);
        return true;
    }

    @Override
    public boolean deleteBook(int id) throws MyBookService.BookNotFoundEx {
        for (MyBookService.Book theBook: bookList) {
            if (theBook.getId() == id) {
                bookList.remove((theBook));
                return true;
            }
        }
        throw new MyBookService.BookNotFoundEx();
    }

    @Override
    public boolean updateBook(int id, String title, String author, double price) throws MyBookService.BookNotFoundEx {
        for (Book theBook: bookList) {
            if (theBook.getId() == id) {
                theBook.setAuthor(author);
                theBook.setTitle(title);
                theBook.setPrice(price);
                return true;
            }
        }
        throw new BookNotFoundEx();
    }
}
