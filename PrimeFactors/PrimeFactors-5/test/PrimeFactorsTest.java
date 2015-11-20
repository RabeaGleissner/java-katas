import org.junit.Test;
import primeFactors.PrimeFactors;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    private List<Integer> list() {
        return new ArrayList<Integer>();
    }

}