import junit.framework.TestCase;
import primes.PrimeFactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static primes.PrimeFactors.generate;

/**
 * Created by rabeagleissner on 18/11/2015.
 */
public class PrimeFactorsTest extends TestCase {
    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints)
            list.add(i);
        return list;
    }
    public void testOne() throws Exception {
        assertEquals(list(), generate(1));
    }

    public void testTwo() throws Exception {
        assertEquals(list(2), generate(2));
    }
}