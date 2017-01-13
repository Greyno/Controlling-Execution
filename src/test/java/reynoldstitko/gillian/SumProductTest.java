package reynoldstitko.gillian;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class SumProductTest {

    SumProduct productTester;
    SumProduct sumTester;

    @Before
    public void setUp(){
        productTester = new SumProduct();
        sumTester = new SumProduct();
    }

    @Test
    public void productTest(){
        int expected = 24;
        int actual = productTester.product(4);
        assertEquals("I expected the product to be 24", expected, actual);
    }

    @Test
    public void sumTest(){
        int expected = 10;
        int actual = sumTester.sum(4);
        assertEquals("I expected the product to be 10", expected, actual);
    }
}
