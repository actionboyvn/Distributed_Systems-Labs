package client;
import MyBookService.BookExistsEx;
import MyBookService.BookNotFoundEx;
import MyBookService.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
public class WSClient {
    public static void main(String[] args) throws MalformedURLException, BookNotFoundEx {
        ///////////////TEST BOTTOM UP SERVER/////////////////////////
        URL addr1 = new URL("http://localhost:8081/bookservice?wsdl");
        MyBookService.MyBookServiceBookService bService1 = new MyBookService.MyBookServiceBookService(addr1);
        MyBookService.BookService pServiceProxy1 = bService1.getBookServiceImplPort();
        List<MyBookService.Book> bookList = pServiceProxy1.getAllBooks();
        System.out.println("/////////////TEST BOTTOM UP SERVER///////////////////");
        System.out.println("Number of books: " + bookList.size());
        for (MyBookService.Book book: bookList) {
            System.out.println("\tBook id = " + book.getId() + ", title: " + book.getTitle() + ", author: " + book.getAuthor() + ", price = " + book.getPrice());
        }
        try {
            pServiceProxy1.addBook(4, "Book4", "Rafał Kruszyna", 213);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            pServiceProxy1.deleteBook(1);
            pServiceProxy1.deleteBook(1);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        try {
//            pServiceProxy1.deleteBook(1);
//        }
//        catch (BookNotFoundEx e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            MyBookService.Book getBook = pServiceProxy1.getBook(4);
//            System.out.println();
//            System.out.println("Get Book id = " + getBook.getId() + ", title: " + getBook.getTitle() + ", author: " + getBook.getAuthor() + ", price = " + getBook.getPrice());
//            System.out.println();
//        }
//        catch (BookNotFoundEx e) {
//            System.out.println(e.getMessage());
//        }
//        bookList = pServiceProxy1.getAllBooks();
//        System.out.println("Number of books: " + bookList.size());
//        for (MyBookService.Book book: bookList) {
//            System.out.println("\tBook id = " + book.getId() + ", title: " + book.getTitle() + ", author: " + book.getAuthor() + ", price = " + book.getPrice());
//        }
//        System.out.println();

        ///////////////TEST TOP DOWN SERVER/////////////////////////
//        URL addr2 = new URL("http://localhost:8082/bookservice?wsdl");
//        MyBookService_TopDown.MyBookServiceBookService bService2 = new MyBookService_TopDown.MyBookServiceBookService(addr2);
//        MyBookService_TopDown.BookService pServiceProxy2 = bService2.getBookServiceImplPort();
//        List<MyBookService_TopDown.Book> bookList2 = pServiceProxy2.getAllBooks();
//        System.out.println("/////////////TEST TOP DOWN SERVER///////////////////");
//        System.out.println("Number of books: " + bookList2.size());
//        for (MyBookService_TopDown.Book book: bookList2) {
//            System.out.println("\tBook id = " + book.getId() + ", title: " + book.getTitle() + ", author: " + book.getAuthor() + ", price = " + book.getPrice());
//        }
//        try {
//            pServiceProxy2.addBook(4, "Book4", "Małgorzata Jasińska", 102);
//        }
//        catch (BookExistsEx_Exception e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            pServiceProxy2.deleteBook(1);
//        }
//        catch (BookNotFoundEx_Exception e) {
//            System.out.println(e.getMessage());
//        }

//        bookList2 = pServiceProxy2.getAllBooks();
//        System.out.println();
//        System.out.println("Number of books: " + bookList2.size());
//        for (MyBookService_TopDown.Book book: bookList2) {
//            System.out.println("\tBook id = " + book.getId() + ", title: " + book.getTitle() + ", author: " + book.getAuthor() + ", price = " + book.getPrice());
//        }
    }
}
