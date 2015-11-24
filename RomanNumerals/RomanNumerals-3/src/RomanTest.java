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
    public void convert5() {
        assertEquals("V", Roman.convert(5));
    }

    @Test
    public void convert7() {
        assertEquals("VII", Roman.convert(7));

    }

    @Test
    public void convert10() {
        assertEquals("X", Roman.convert(10));
    }

    @Test
    public void convert16() {
        assertEquals("XVI", Roman.convert(16));
    }
}