package primeFactors;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    private List<Integer> list() {
        return null;
    }

    @Test
    public void testOne() {
       assertEquals(list(), PrimeFactors.generate(1));
    }
}