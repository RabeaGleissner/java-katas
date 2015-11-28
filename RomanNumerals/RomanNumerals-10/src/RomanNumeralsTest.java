import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    @Test
    public void convert1() {
        assertEquals("I", RomanNumerals.convert(1));
    }

    @Test
    public void convert2() {
        assertEquals("II", RomanNumerals.convert(2));

    }

    @Test
    public void convert3() {
        assertEquals("III", RomanNumerals.convert(3));

    }

    @Test
    public void convert10() {
        assertEquals("X", RomanNumerals.convert(10));

    }

    @Test
    public void convert20() {
        assertEquals("XX", RomanNumerals.convert(20));

    }
}