package MyPersonService;
import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {
    private List<Person> personList;
    public PersonRepositoryImpl() {
        personList = new ArrayList<>();
        personList.add(new Person(1, "Mariusz" , 9));
        personList.add(new Person(2, "Andrzej", 10));
    }
    public List<Person> getAllPersons() {
        return personList;
    }
    public Person getPerson(int id) throws PersonNotFoundEx_Exception {
        for (Person thePerson : personList) {
            if (thePerson.getId() == id) {
                return thePerson;
            }
        }
        throw new PersonNotFoundEx_Exception();
    }
    public Person addPerson(int id, String name, int age) throws
            PersonExistsEx_Exception {
        for (Person thePerson : personList) {
            if (thePerson.getId() == id) {
                throw new PersonExistsEx_Exception();
            }
        }
        Person person = new Person(id, name, age);
        personList.add(person);
        return person;
    }
    public boolean deletePerson(int id) throws PersonNotFoundEx_Exception {
        //[... check if person of given id exists and remove or throw exeption ]
        return true;
    }
    public Person updatePerson(int id, String name, int age) throws
            PersonNotFoundEx_Exception {
        //[... check if person of given id exists and update or throw exeption ]
        return personList.get(0);
    }
    public int countPersons() {
        return personList.size();
    }
}
