package MyApplication.services;

import MyApplication.respositories.IPersonRepository;
import MyApplication.respositories.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AwesomerTest {

    @Mock
    IPersonRepository mockRepo;

    @Test
    public void makesPeopleAwesome(){

        List<Person> people = new ArrayList<>();
        people.add(new Person("FIRST","LAST"));
        people.add(new Person("FN","LN"));
        Mockito.when(mockRepo.findAll()).thenReturn(people);

        Awesomer awesomerService = new Awesomer(mockRepo);
        assertEquals("FIRST LAST is awesome.\nFN LN is awesome.\n", awesomerService.makeEveryoneAwesome());
    }
}
