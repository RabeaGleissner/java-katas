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

    @Test
    public void convertTwenty() {
        assertEquals("XX", Roman.convert(20));
    }

    @Test
    public void convertThirty() {
        assertEquals("XXX", Roman.convert(30));

    }

    @Test
    public void convertEleven() {
        assertEquals("XI", Roman.convert(11));
    }

    @Test
    public void convertEight() {
        assertEquals("VIII", Roman.convert(8));
    }
}