package reynoldstitko.gillian;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class GreetingTest {
    Greeting greeting;

    @Before
    public void setUp(){
        greeting = new Greeting();
    }


    @Test
    public void compareInputBobNamesTest(){
        String expected = "Hello Bob";
        String actual = greeting.compareInputNames("Bob");
        assertEquals("I expected Hello Bob", expected, actual);
    }

    @Test
    public void compareInputGillianNamesTest(){
        String expected = "Hi";
        String actual = greeting.compareInputNames("Gillian");
        assertEquals("I expected Hi", expected, actual);
    }

    @Test
    public void compareInputAliceNamesTest(){
        String expected = "Hello Alice";
        String actual = greeting.compareInputNames("Alice");
        assertEquals("I expected Hello Alice", expected, actual);
    }
    }

