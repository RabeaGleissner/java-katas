import org.junit.Test;
import primeFactors.PrimeFactors;
import static primeFactors.PrimeFactors.generate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    @Test
    public void testOne() {
        assertEquals(Arrays.asList(),generate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(Arrays.asList(2),generate(2));

    }

    @Test
    public void testThree() {
        assertEquals(Arrays.asList(3),generate(3));

    }

    @Test
    public void testFour() {
        assertEquals(Arrays.asList(2,2),generate(4));

    }

    @Test
    public void testSix() {
        assertEquals(Arrays.asList(2,3),generate(6));

    }

    @Test
    public void testEight() {
        assertEquals(Arrays.asList(2,2,2),generate(8));

    }

    @Test
    public void testNine() {
        assertEquals(Arrays.asList(3,3),generate(9));

    }
}