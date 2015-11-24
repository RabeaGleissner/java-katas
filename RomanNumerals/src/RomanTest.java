import org.junit.Test;

import static org.junit.Assert.*;

public class RomanTest {
    @Test
    public void convertOne() {
        assertEquals("I", Roman.convert(1));
    }

}