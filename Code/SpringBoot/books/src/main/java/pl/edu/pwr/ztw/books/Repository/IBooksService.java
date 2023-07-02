package pl.edu.pwr.ztw.books.Repository;

import pl.edu.pwr.ztw.books.Models.Book;
import pl.edu.pwr.ztw.books.Models.Dtos.CreateBookDto;
import pl.edu.pwr.ztw.books.Models.Dtos.GetBookDto;

import java.util.Collection;

public interface IBooksService {
    GetBookDto getGetBookDto(int id);
    Collection<GetBookDto> getGetBooksDtos();
    Collection<Book> getBooks();
    int addBook(CreateBookDto createBook);
    void updateBook(Book book);
    void deleteBook(int id);
    void deleteAuthorsBooks(int authorId);
}
