package primeFactors;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
import static primeFactors.PrimeFactors.generate;

public class PrimeFactorsTest {

    @Test
    public void testOne() {
       assertEquals(Arrays.asList(), generate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(Arrays.asList(2), generate(2));
    }

    @Test
    public void testThree() {
        assertEquals(Arrays.asList(3), generate(3));
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
}