package MyPersonService;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository{
    private List<Person> personList;
    public PersonRepositoryImpl() {
        personList = new ArrayList<>();
        personList.add(new Person(1, "Mariusz" , 9));
        personList.add(new Person(2, "Andrzej", 10));
    }
    public List<Person> getAllPersons() {
        return personList;
    }
    public Person getPerson(int id) throws PersonNotFoundEx {
        for (Person thePerson : personList) {
            if (thePerson.getId() == id) {
                return thePerson;
            }
        }
        throw new PersonNotFoundEx();
    }
    public Person addPerson(int id, String name, int age) throws
            PersonExistsEx {
        for (Person thePerson : personList) {
            if (thePerson.getId() == id) {
                throw new PersonExistsEx();
            }
        }
        Person person = new Person(id, name, age);
        personList.add(person);
        return person;
    }
    public boolean deletePerson(int id) throws PersonNotFoundEx {
        //[... check if person of given id exists and remove or throw exeption ]
        return true;
    }
    public Person updatePerson(int id, String name, int age) throws
            PersonNotFoundEx {
        //[... check if person of given id exists and update or throw exeption ]
        return personList.get(0);
    }
    public int countPersons() {
        return personList.size();
    }
}
