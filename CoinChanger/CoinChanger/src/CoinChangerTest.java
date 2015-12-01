import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangerTest {

    @Test
    public void changeFor1() {
        assertEquals(1, CoinChanger.giveChane(1));
    }
}