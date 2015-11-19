import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import static primeFactors.PrimeFactors.generate;
import junit.framework.TestCase;
import org.junit.Test;
import primeFactors.PrimeFactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class PrimeFactorsTest {

    @Test
    public void testOne() throws Exception {
        assertEquals(Arrays.asList(),generate(1));
    }

    @Test
    public void testTwo() throws Exception {
        assertEquals(Arrays.asList(2),generate(2));
    }

    @Test
    public void testThree() throws Exception {
        assertEquals(Arrays.asList(3),generate(3));
    }

    @Test
    public void testFour() throws Exception {
        assertEquals(Arrays.asList(2,2),generate(4));

    }

    @Test
    public void testFive() throws Exception {
        assertEquals(Arrays.asList(2,3),generate(6));
    }
}