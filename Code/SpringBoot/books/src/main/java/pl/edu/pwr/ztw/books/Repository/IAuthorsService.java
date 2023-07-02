package pl.edu.pwr.ztw.books.Repository;

import pl.edu.pwr.ztw.books.Models.Author;
import pl.edu.pwr.ztw.books.Models.Dtos.CreateAuthorDto;

import java.util.Collection;

public interface IAuthorsService {
    Author getAuthor(int id);
    Collection<Author> getAuthors();
    int addAuthor(CreateAuthorDto createAuthor);
    void updateAuthor(Author author);
    int deleteAuthor(int id);
}
