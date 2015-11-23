import org.junit.Test;
import primeFactors.PrimeFactors;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i : ints) {
            list.add(i);
        }
        return list;
    }

    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(list(2), PrimeFactors.generate(2));
    }
}