package reynoldstitko.gillian;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class SumOfNumberTest {

    SumOfNumbers sumOfNumbers;

    @Before
    public  void  setUp() {
        sumOfNumbers = new SumOfNumbers();
    }

    @Test
    public void sumNumbersTest(){
        int expected = 10;
        int actual = sumOfNumbers.sumNumbers(4);
        assertEquals("I expected the sum (with an input of 4) to be 10", actual, expected);
    }
}
