package MyApplication.respositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository implements IPersonRepository {
    @Override
    public List<Person> findAll() {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Fred", "Bloggs"));
        people.add(new Person("Jill", "Bloggs"));
        people.add(new Person("Jack", "Bloggs"));
        people.add(new Person("Joe", "Blow"));
        return people;
    }
}
