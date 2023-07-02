package com.example.book;
import RabbitMQ.ImageServiceClient;
import RabbitMQ.LogServiceProducer;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import java.text.SimpleDateFormat;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
@CrossOrigin(origins = "*")
@RestController
public class BookController {
    BookRepository dataRepo;
    ImageServiceClient imgClient;
    LogServiceProducer logService;
    Date date;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public BookController() throws IOException, TimeoutException {
        dataRepo = new BookRepositoryImpl();
        imgClient = new ImageServiceClient();
        logService = new LogServiceProducer();
    }

    @GetMapping("/books")
    public CollectionModel<EntityModel<Book>> getAllBooks(){
        try {
            date = new Date();
            logService.logCRUD(dateFormat.format(date) + ": Get all books");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        List<EntityModel<Book>> books = dataRepo.getAllBooks()
                .stream()
                .map(book -> {
                    EntityModel<Book> em = EntityModel.of(book);
                    em.add(linkTo(methodOn(BookController.class).getBook(book.getId())).withSelfRel());
                    if (book.getStatus() == Book.BookStatus.AVAILABLE) {
                        em.add(linkTo(methodOn(BookController.class).deleteBook(book.getId())).withRel("delete"));
                        em.add(linkTo(methodOn(BookController.class).borrowBook(book.getId())).withRel("borrow"));
                    } else {
                        em.add(linkTo(methodOn(BookController.class).returnBook(book.getId())).withRel("return"));
                    }
                    em.add(linkTo(methodOn(BookController.class).getAllBooks()).withRel("list all"));
                    return em;
                }).collect(Collectors.toList());
        return CollectionModel.of(books,
                linkTo(methodOn(BookController.class)
                        .getAllBooks()).withSelfRel());
    }

    @GetMapping("/books/{id}")
    public EntityModel<Book> getBook(@PathVariable int id) {
        try {
            date = new Date();
            logService.logCRUD(dateFormat.format(date) + ": Get book id = " + id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Book book = dataRepo.getBook(id);
        EntityModel<Book> em = EntityModel.of(book);
        em.add(linkTo(methodOn(BookController.class).getBook(id)).withSelfRel());
        if (book.getStatus() == Book.BookStatus.AVAILABLE) {
            em.add(linkTo(methodOn(BookController.class).deleteBook(id)).withRel("delete"));
            em.add(linkTo(methodOn(BookController.class).borrowBook(id)).withRel("borrow"));
        } else {
            em.add(linkTo(methodOn(BookController.class).returnBook(id)).withRel("return"));
        }
        em.add(linkTo(methodOn(BookController.class).getAllBooks()).withRel("list all"));
        return em;
    }

    @PostMapping("/books")
    public ResponseEntity<Object> addBook(@RequestBody Book newBook) {
        try {
            date = new Date();
            logService.logCRUD(dateFormat.format(date) + ": Add book: " + newBook.getTitle() + ", " + newBook.getAuthor() + ", " + newBook.getPages());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(dataRepo.addBook(newBook));
    }

    @PutMapping("/books")
    public ResponseEntity<Object> updateBook(@RequestBody Book book) {
        try {
            date = new Date();
            logService.logCRUD(dateFormat.format(date) + ": Update book: " + book.getTitle() + ", " + book.getAuthor() + ", " + book.getPages());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(dataRepo.updateBook(book));
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Object> deleteBook(@PathVariable int id) {
        try {
            date = new Date();
            logService.logCRUD(dateFormat.format(date) + ": Delete book id = " + id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dataRepo.deleteBook(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/books/{id}/borrow")
    public EntityModel<Book> borrowBook(@PathVariable int id) {
        try {
            date = new Date();
            logService.logStatus(dateFormat.format(date) + ": Book id " + id + ", status: BORROWED");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Book book = dataRepo.borrowBook(id);
        return EntityModel.of(book,
                linkTo(methodOn(BookController.class).getBook(id)).withSelfRel(),
                linkTo(methodOn(BookController.class).returnBook(id)).withRel("return"),
                linkTo(methodOn(BookController.class).getAllBooks()).withRel("list all")
        );
    }

    @PatchMapping("/books/{id}/return")
    public EntityModel<Book> returnBook(@PathVariable int id) {
        try {
            date = new Date();
            logService.logStatus(dateFormat.format(date) + ": Book id " + id + ", status: AVAILABLE");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Book book = dataRepo.returnBook(id);
        return EntityModel.of(book,
                linkTo(methodOn(BookController.class).getBook(id)).withSelfRel(),
                linkTo(methodOn(BookController.class).borrowBook(id)).withRel("borrow"),
                linkTo(methodOn(BookController.class).deleteBook(id)).withRel("delete"),
                linkTo(methodOn(BookController.class).getAllBooks()).withRel("list all")
        );
    }

    @GetMapping("/images/{id}")
    public ResponseEntity<Object> getImage(@PathVariable int id) throws IOException, TimeoutException, ExecutionException, InterruptedException {
        byte[] imageBytes = imgClient.call(Integer.toString(id));
        return ResponseEntity
                .status(HttpStatus.OK)
                .header(HttpHeaders.CONTENT_TYPE, String.valueOf(MediaType.IMAGE_JPEG))
                .body(imageBytes);
    }

    @PostMapping("/images")
    public ResponseEntity<Object> postImage(@RequestBody Image newImage) throws IOException {
        String encodedImg = newImage.getImageBytes().split(",")[1];
        byte[] decodedImg = Base64.getDecoder().decode(encodedImg);
        imgClient.upload(newImage.getImageName(), decodedImg);
        return ResponseEntity
                .status(HttpStatus.OK)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body("Uploaded");
    }
}
