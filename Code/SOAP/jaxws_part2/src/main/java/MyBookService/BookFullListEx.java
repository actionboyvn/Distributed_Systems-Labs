package MyBookService;

public class BookFullListEx extends Exception{
    public BookFullListEx() {
        super("The maximum number of books has reached.");
    }
}
