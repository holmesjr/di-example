import MyApplication.Application;
import MyApplication.respositories.IPersonRepository;
import MyApplication.respositories.Person;
import MyApplication.services.IAwesomer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

    @Mock
    IAwesomer mockAwesomer;

    @Mock
    IPersonRepository mockRepo;

    @Test
    public void sendsPeopleToTheAwesomerService(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("a", "b"));
        Mockito.when(mockRepo.findAll()).thenReturn(people);
        Mockito.when(mockAwesomer.makeEveryoneAwesome(people)).thenReturn("AWESOMER RESULT");

        Application app = new Application(mockAwesomer, mockRepo);

        assertEquals("AWESOMER RESULT", app.home());
    }

}
