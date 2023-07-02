
package MyBookService_TopDown;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the MyBookService_TopDown package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookExistsEx_QNAME = new QName("http://MyBookService/", "BookExistsEx");
    private final static QName _BookNotFoundEx_QNAME = new QName("http://MyBookService/", "BookNotFoundEx");
    private final static QName _AddBook_QNAME = new QName("http://MyBookService/", "addBook");
    private final static QName _AddBookResponse_QNAME = new QName("http://MyBookService/", "addBookResponse");
    private final static QName _DeleteBook_QNAME = new QName("http://MyBookService/", "deleteBook");
    private final static QName _DeleteBookResponse_QNAME = new QName("http://MyBookService/", "deleteBookResponse");
    private final static QName _GetAllBooks_QNAME = new QName("http://MyBookService/", "getAllBooks");
    private final static QName _GetAllBooksResponse_QNAME = new QName("http://MyBookService/", "getAllBooksResponse");
    private final static QName _GetBook_QNAME = new QName("http://MyBookService/", "getBook");
    private final static QName _GetBookResponse_QNAME = new QName("http://MyBookService/", "getBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: MyBookService_TopDown
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookExistsEx }
     * 
     */
    public BookExistsEx createBookExistsEx() {
        return new BookExistsEx();
    }

    /**
     * Create an instance of {@link BookNotFoundEx }
     * 
     */
    public BookNotFoundEx createBookNotFoundEx() {
        return new BookNotFoundEx();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookExistsEx }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookExistsEx }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "BookExistsEx")
    public JAXBElement<BookExistsEx> createBookExistsEx(BookExistsEx value) {
        return new JAXBElement<BookExistsEx>(_BookExistsEx_QNAME, BookExistsEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookNotFoundEx }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookNotFoundEx }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "BookNotFoundEx")
    public JAXBElement<BookNotFoundEx> createBookNotFoundEx(BookNotFoundEx value) {
        return new JAXBElement<BookNotFoundEx>(_BookNotFoundEx_QNAME, BookNotFoundEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<DeleteBook>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<DeleteBookResponse>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<GetAllBooks>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<GetAllBooksResponse>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<GetBook>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://MyBookService/", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<GetBookResponse>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

}
