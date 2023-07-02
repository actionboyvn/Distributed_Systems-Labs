package MyBookService;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository{
    private List<Book> bookList;
    public BookRepositoryImpl() {
        bookList = new ArrayList<>();
        bookList.add(new Book(1, "Book1", "Hien Le", 59.99));
        bookList.add(new Book(2, "Book2", "Michał Kowal", 97));
        bookList.add(new Book(3, "Book3", "Łukasz Małecki", 199));
    }
    @Override
    public Book getBook(int id) throws BookNotFoundEx {
        for (Book book: bookList) {
            if (book.getId() == id)
                return book;
        }
        throw new BookNotFoundEx();
    }
    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public boolean addBook(int id, String title, String author, double price) throws BookExistsEx {
        for (Book theBook: bookList) {
            if (theBook.getId() == id) {
                throw new BookExistsEx();
            }
        }
        Book newBook = new Book(id, title, author, price);
        bookList.add(newBook);
        return true;
    }

    @Override
    public boolean deleteBook(int id) throws BookNotFoundEx {
        for (Book theBook: bookList) {
            if (theBook.getId() == id) {
                bookList.remove((theBook));
                return true;
            }
        }
        throw new BookNotFoundEx();
    }

    @Override
    public boolean updateBook(int id, String title, String author, double price) throws BookNotFoundEx {
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
