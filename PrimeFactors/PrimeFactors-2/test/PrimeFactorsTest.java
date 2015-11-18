import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;
import primeFactors.PrimeFactors;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactorsTest extends TestCase {
    public void testOne() throws Exception {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    private List<Integer> list() {
        return new ArrayList<Integer>();
    }

}