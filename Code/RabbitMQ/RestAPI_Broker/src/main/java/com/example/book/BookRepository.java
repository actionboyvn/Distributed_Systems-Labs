package com.example.book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBooks();
    Book getBook(int id) throws BookNotFoundEx;
    Book updateBook(Book book) throws BookNotFoundEx;
    Boolean deleteBook(int id) throws BookNotFoundEx;
    Book addBook(Book newBook) throws BadRequestEx;
    Book borrowBook(int id);
    Book returnBook(int id);
}
