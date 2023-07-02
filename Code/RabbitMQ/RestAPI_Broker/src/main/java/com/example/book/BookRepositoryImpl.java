package com.example.book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements  BookRepository{
    List<Book> bookList;
    public BookRepositoryImpl() {
        bookList = new ArrayList<>();
        bookList.add(new Book(1, "The Long Journey", "Maria Pia", 324, 99.9, Book.BookStatus.AVAILABLE));
        bookList.add(new Book(2, "Dark Star Safari", "Paul Theroux", 496, 125, Book.BookStatus.AVAILABLE));
    }
    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public Book getBook(int id) throws BookNotFoundEx{
        for (Book book: bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        throw new BookNotFoundEx(id);
    }

    @Override
    public Book updateBook(Book book) throws BookNotFoundEx{
        if (book.getAuthor().length() == 0)
            throw new BadRequestEx("Author's name must be specified.");
        if (book.getTitle().length() == 0)
            throw new BadRequestEx("Title must be specified.");
        if (book.getPrice() < 0)
            throw new BadRequestEx("Price can not be negative.");
        for (int i = 0; i < bookList.size(); i++)
            if (bookList.get(i).getId() == book.getId()) {
                bookList.set(i, book);
                return book;
            }
        throw new BookNotFoundEx(book.getId());
    }

    @Override
    public Boolean deleteBook(int id) {
        for (int i = 0; i < bookList.size(); i++)
            if (bookList.get(i).getId() == id) {
                bookList.remove(i);
                return true;
            }
        throw new BookNotFoundEx(id);
    }

    @Override
    public Book addBook(Book newBook) throws BookExistsEx, BadRequestEx{
        for (Book book: bookList)
            if (book.getId() == newBook.getId())
                throw new BookExistsEx(newBook.getId());
        if (newBook.getAuthor().length() == 0)
            throw new BadRequestEx("Author's name must be specified.");
        if (newBook.getTitle().length() == 0)
            throw new BadRequestEx("Title must be specified.");
        if (newBook.getPrice() < 0)
            throw new BadRequestEx("Price can not be negative.");
        if (newBook.getPages() < 0)
            throw new BadRequestEx("Pages can not be negative.");
        bookList.add(newBook);
        return newBook;
    }

    @Override
    public Book borrowBook(int id) {
        for (Book book: bookList)
            if (book.getId() == id) {
                if (book.getStatus().equals(Book.BookStatus.AVAILABLE)) {
                    book.setStatus(Book.BookStatus.BORROWED);
                    return book;
                } else {
                    throw new ConflictEx(book.getStatus().name());
                }
            }
        throw new BookNotFoundEx(id);
    }

    @Override
    public Book returnBook(int id) {
        for (Book book: bookList)
            if (book.getId() == id) {
                if (book.getStatus().equals(Book.BookStatus.BORROWED)) {
                    book.setStatus(Book.BookStatus.AVAILABLE);
                }
                return book;
            }
        throw new BookNotFoundEx(id);    }
}
