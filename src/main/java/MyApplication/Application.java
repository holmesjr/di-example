package MyApplication;

import MyApplication.services.IAwesomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class Application {


    private final IAwesomer awesomer;

    @Autowired
    public Application(IAwesomer awesomer) {

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
