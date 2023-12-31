
package MyPersonService;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "PersonService", targetNamespace = "http://MyPersonService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonService {


    /**
     * 
     * @param arg0
     * @return
     *     returns MyPersonService.Person
     * @throws PersonNotFoundEx_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://MyPersonService/", className = "MyPersonService.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://MyPersonService/", className = "MyPersonService.GetPersonResponse")
    public Person getPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws PersonNotFoundEx_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<MyPersonService.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllPersons", targetNamespace = "http://MyPersonService/", className = "MyPersonService.GetAllPersons")
    @ResponseWrapper(localName = "getAllPersonsResponse", targetNamespace = "http://MyPersonService/", className = "MyPersonService.GetAllPersonsResponse")
    public List<Person> getAllPersons();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns MyPersonService.Person
     * @throws PersonExistsEx_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPerson", targetNamespace = "http://MyPersonService/", className = "MyPersonService.AddPerson")
    @ResponseWrapper(localName = "addPersonResponse", targetNamespace = "http://MyPersonService/", className = "MyPersonService.AddPersonResponse")
    public Person addPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2)
        throws PersonExistsEx_Exception
    ;

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "countPersons", targetNamespace = "http://MyPersonService/", className = "MyPersonService.CountPersons")
    @ResponseWrapper(localName = "countPersonsResponse", targetNamespace = "http://MyPersonService/", className = "MyPersonService.CountPersonsResponse")
    public int countPersons();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     * @throws PersonNotFoundEx_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://MyPersonService/", className = "MyPersonService.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://MyPersonService/", className = "MyPersonService.DeletePersonResponse")
    public boolean deletePerson(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws PersonNotFoundEx_Exception
    ;

}
