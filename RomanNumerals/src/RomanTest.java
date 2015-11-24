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

    @Test
    public void converFive() {
        assertEquals("V", Roman.convert(5));
    }

    @Test
    public void convertTen() {
        assertEquals("X", Roman.convert(10));
    }
}