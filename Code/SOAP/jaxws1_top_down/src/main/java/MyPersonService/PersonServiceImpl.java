package MyPersonService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService(serviceName = "MyPersonService.PersonService",
        endpointInterface = "MyPersonService.PersonService")
public class PersonServiceImpl implements PersonService {
    private PersonRepository dataRepository = new PersonRepositoryImpl();
    @WebMethod
    public Person getPerson(int id) throws PersonNotFoundEx_Exception {
        System.out.println("...called getPerson id="+id);
        return dataRepository.getPerson(id);
    }
    @WebMethod
    public List<Person> getAllPersons() {
        System.out.println("...called getAllPersons");
        return dataRepository.getAllPersons();
    }
    @WebMethod
    public Person addPerson(int id, String name, int age) throws
            PersonExistsEx_Exception {
        return null;
    }
    @WebMethod
    public boolean deletePerson(int id) throws PersonNotFoundEx_Exception {
        return true;
    }
    @WebMethod
    public int countPersons() {
        return 0;
    }
}