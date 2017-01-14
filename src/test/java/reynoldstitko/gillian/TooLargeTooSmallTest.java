package reynoldstitko.gillian;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class TooLargeTooSmallTest {

    TooLargeTooSmall tooLargeTooSmall;

    @Before
    public  void  setUp() {
       tooLargeTooSmall = new TooLargeTooSmall();
    }

    @Test
    public void compareNumbersLessTest(){
        int expected = 1;
        tooLargeTooSmall.computerGuess = 2.0; //Create a random number to check against
        int actual = tooLargeTooSmall.compareNumbers(1);
        assertEquals("Expected a value of 1", expected, actual);
    }

    @Test
    public void compareNumbersEqualTest(){
        int expected = 3;
        tooLargeTooSmall.computerGuess = 1.0;
        int actual = tooLargeTooSmall.compareNumbers(1);
        assertEquals("Expected a value of 3", expected, actual);
    }

    @Test
    public void compareNumbersGreaterTest(){
        int expected = 2;
        tooLargeTooSmall.computerGuess = 1.0;
        int actual = tooLargeTooSmall.compareNumbers(3);
        assertEquals("Expected a value of 2", expected, actual);
    }

    @Test
    public void showResultOfComparisonLessTest(){
        String expected = "Your guess was too low.";
        String actual = tooLargeTooSmall.showResultOfComparison(1);
        assertEquals("Expected 'Your guess was too low'", actual, expected);
    }

    @Test
    public void showResultOfComparisonGreaterTest(){
        String expected = "Your guess was too high.";
        String actual = tooLargeTooSmall.showResultOfComparison(2);
        assertEquals("Expected 'Your guess was too high'", actual, expected);
    }

    @Test
    public void showResultOfComparisonEqualTest(){
        String expected = "Your guess was just right! You won!";
        String actual = tooLargeTooSmall.showResultOfComparison(3);
        assertEquals("Expected 'Your guess was just right! You won!'", actual, expected);
    }

    @Test
    public void numberOfTrialsTest(){
        int expected = 1;
        int actual = tooLargeTooSmall.numberOfTrials();
    }

}
