import org.junit.Test;

import static org.junit.Assert.*;

public class RomanTest {
    @Test
    public void convert1() {
        assertEquals("I", Roman.convert(1));
    }

}