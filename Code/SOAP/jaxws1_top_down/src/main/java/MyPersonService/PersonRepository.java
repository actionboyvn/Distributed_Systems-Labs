package MyPersonService;
import java.util.List;

public interface PersonRepository {
    List<Person> getAllPersons();
    Person getPerson(int id) throws PersonNotFoundEx_Exception;
    Person updatePerson(int id, String name, int age) throws
            PersonNotFoundEx_Exception;
    boolean deletePerson(int id) throws PersonNotFoundEx_Exception;
    Person addPerson(int id, String name, int age) throws PersonExistsEx_Exception;
    int countPersons();
}