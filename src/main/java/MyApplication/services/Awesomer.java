package MyApplication.services;

import MyApplication.respositories.IPersonRepository;
import MyApplication.respositories.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Awesomer {
    private final IPersonRepository personRepository;

    @Autowired
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
