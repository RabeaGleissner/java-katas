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
}