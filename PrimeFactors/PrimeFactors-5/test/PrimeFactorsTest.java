import org.junit.Test;
import primeFactors.PrimeFactors;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
    }

}