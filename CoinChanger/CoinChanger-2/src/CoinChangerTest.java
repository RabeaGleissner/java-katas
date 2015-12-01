import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangerTest {

    @Test
    public void changeForOne() {
        assertEquals(1, CoinChanger.giveChange(1));
    }

}