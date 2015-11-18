import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by rabeagleissner on 18/11/2015.
 */
public class PrimeFactorsTest extends TestCase {
    private List<Integer> list() {
        return new ArrayList<Integer>();
    }
    public void testOne() throws Exception {
        assertEquals(list(), PrimeFactors.generate(1));
    }
}