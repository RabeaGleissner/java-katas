import org.junit.Test;

import static org.junit.Assert.*;

public class RomanTest {

    @Test
    public void convert1() {
        assertEquals("I", Roman.convert(1));
    }

    @Test
    public void convert2() {
        assertEquals("II", Roman.convert(2));

    }

    @Test
    public void convert3() {
        assertEquals("III", Roman.convert(3));

    }

    @Test
    public void convert10() {
        assertEquals("X", Roman.convert(10));
    }

    @Test
    public void convert20() {
        assertEquals("XX", Roman.convert(20));

    }

    @Test
    public void convert100() {
        assertEquals("C", Roman.convert(100));

    }
}
