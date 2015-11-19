package primeFactors;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class PrimeFactorsTest {

    @Test
    public void testOne() {
       assertEquals(Arrays.asList(), PrimeFactors.generate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(Arrays.asList(2), PrimeFactors.generate(2));

    }
}