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
}