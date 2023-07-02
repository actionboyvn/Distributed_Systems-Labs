package MyBookService;

public class BookNotFoundEx extends  Exception{
    public BookNotFoundEx() {
        super("The specified book does not exist");
    }
}
