import primeFactors.PrimeFactors;
import static primeFactors.PrimeFactors.generate;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class PrimeFactorsTest {
    private List<Integer> list() {
        return new ArrayList<Integer>();
    }
    @Test
    public void testOne() {
        assertEquals(list(), generate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(Arrays.asList(2),generate(2));

    }

    @Test
    public void testThree() {
        assertEquals(Arrays.asList(3),generate(3));

    }

    @Test
    public void testFour() {
        assertEquals(Arrays.asList(2,2),generate(4));
    }

    @Test
    public void testSix() {
        assertEquals(Arrays.asList(2,3),generate(6));

    }
}