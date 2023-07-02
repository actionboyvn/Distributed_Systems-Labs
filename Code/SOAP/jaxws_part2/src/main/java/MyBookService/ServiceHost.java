package MyBookService;

import jakarta.xml.ws.Endpoint;

import java.io.IOException;

import static java.lang.System.exit;

public class ServiceHost {
    public static void main(String[] args) {
        System.out.println("Web Service MyBookService.BookService is running ...");
        BookServiceImpl bsi = new BookServiceImpl();
        Endpoint.publish("http://localhost:8081/bookservice", bsi);
        System.out.println("Press ENTER to STOP MyBookService.BookService ...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        exit(0);
    }
}
