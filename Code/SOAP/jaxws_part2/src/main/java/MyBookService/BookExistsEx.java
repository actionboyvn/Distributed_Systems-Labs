package MyBookService;

import jakarta.xml.ws.WebFault;

@WebFault
public class BookExistsEx extends Exception {
    public BookExistsEx() {
        super("This book already exists");
    }
}
