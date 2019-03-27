package MyApplication.services;

import MyApplication.respositories.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Awesomer implements IAwesomer {

    @Override
    public String makeEveryoneAwesome(List<Person> people) {
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
