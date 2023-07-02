package pl.edu.pwr.ztw.books.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwr.ztw.books.Models.Book;
import pl.edu.pwr.ztw.books.Models.Dtos.CreateBookDto;
import pl.edu.pwr.ztw.books.Repository.IAuthorsService;
import pl.edu.pwr.ztw.books.Repository.IBooksService;

@RestController
public class BooksControler {
    @Autowired
    IBooksService booksService;
    @Autowired
    IAuthorsService authorsService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ResponseEntity<Object> getBooks() {
        return new ResponseEntity<>(booksService.getGetBooksDtos(), HttpStatus.OK);
    }
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getBook(@PathVariable("id") int id){
        return new ResponseEntity<>(booksService.getGetBookDto(id), HttpStatus.OK);
    }
    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public ResponseEntity<Object> addBook(@RequestBody CreateBookDto bookDto) {
        int responseNewId = booksService.addBook(bookDto);
        if(responseNewId == -1){
            return new ResponseEntity<>("Bad request: no author found.", HttpStatus.BAD_REQUEST);
        }
        else{
            return new ResponseEntity<>(responseNewId, HttpStatus.CREATED);
        }
    }
    @RequestMapping(value = "/books", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateBook(@RequestBody Book book) {
        booksService.updateBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteBook(@PathVariable("id") int id) {
        booksService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}