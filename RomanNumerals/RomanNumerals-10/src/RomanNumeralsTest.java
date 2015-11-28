import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    @Test
    public void convert1() {
        assertEquals("I", RomanNumerals.convert(1));
    }

}