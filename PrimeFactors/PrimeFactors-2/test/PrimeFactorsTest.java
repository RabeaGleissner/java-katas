import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import static primeFactors.PrimeFactors.generate;
import junit.framework.TestCase;
import primeFactors.PrimeFactors;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactorsTest extends TestCase {
    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints)
            list.add(i);
        return list;
    }
    private List<Integer> list() {
        return new ArrayList<Integer>();
    }

    public void testOne() throws Exception {
        assertEquals(list(),generate(1));
    }

    public void testTwo() throws Exception {
        assertEquals(list(2),generate(2));
    }

    public void testThree() throws Exception {
        assertEquals(list(3),generate(3));
    }
}