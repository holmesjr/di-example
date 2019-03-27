package MyApplication;

import MyApplication.respositories.IPersonRepository;
import MyApplication.respositories.Person;
import MyApplication.services.IAwesomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class Application {


    private final IAwesomer awesomer;
    private final IPersonRepository personRepository;

    @Autowired
    public Application(IAwesomer awesomer, IPersonRepository personRepository) {

        this.awesomer = awesomer;
        this.personRepository = personRepository;
    }

    @RequestMapping("/")
    public String home() {
        return awesomer.makeEveryoneAwesome(personRepository.findAll());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
