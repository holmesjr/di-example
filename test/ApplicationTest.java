import MyApplication.Application;
import MyApplication.services.IAwesomer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

    @Mock
    IAwesomer awesomer;

    @Test
    public void callsTheAwesomerService(){
        Mockito.when(awesomer.makeEveryoneAwesome()).thenReturn("AWESOMER RESULT");

        Application app = new Application(awesomer);

        assertEquals("AWESOMER RESULT", app.home());
    }

}
