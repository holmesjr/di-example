package MyApplication;

import MyApplication.respositories.PersonRepository;
import MyApplication.services.Awesomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class Application {


    private final Awesomer awesomer;

    @Autowired
    public Application(Awesomer awesomer) {

        this.awesomer = awesomer;
    }

    @RequestMapping("/")
    public String home() {
        return awesomer.makeEveryoneAwesome();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
