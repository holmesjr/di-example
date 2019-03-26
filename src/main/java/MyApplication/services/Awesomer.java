package MyApplication.services;

import MyApplication.respositories.IPersonRepository;
import MyApplication.respositories.Person;

import java.util.List;

public class Awesomer {
    private final IPersonRepository personRepository;

    public Awesomer(IPersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    public String makeEveryoneAwesome() {
        List<Person> people = personRepository.findAll();
        StringBuilder builder = new StringBuilder();
        for (Person person : people) {
            builder.append(person.getFirstName());
            builder.append(" ");
            builder.append(person.getLastName());
            builder.append(" is awesome.");
            builder.append("\n");
        }
        return builder.toString();
    }
}
