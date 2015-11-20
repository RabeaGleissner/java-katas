import org.junit.Test;
import primeFactors.PrimeFactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    private List<Integer> list() {
        return new ArrayList<Integer>();
    }
    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(Arrays.asList(2),PrimeFactors.generate(2));

    }
}