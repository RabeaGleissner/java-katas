import org.junit.Test;

import static org.junit.Assert.*;

public class RomanTest {
    @Test
    public void convertOne() {
        assertEquals("I", Roman.convert(1));
    }

    @Test
    public void convertTwo() {
        assertEquals("II", Roman.convert(2));
    }
    @Test
    public void convertThree() {
        assertEquals("III", Roman.convert(3));
    }
}