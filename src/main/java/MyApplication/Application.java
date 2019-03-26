package MyApplication;

import MyApplication.respositories.PersonRepository;
import MyApplication.services.Awesomer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class Application {


    private final Awesomer awesomer;

    public Application() {
        awesomer = new Awesomer(new PersonRepository());
    }

    @RequestMapping("/")
    public String home() {
        return awesomer.makeEveryoneAwesome();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
