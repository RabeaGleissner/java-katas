import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CoinChangerTest {

    private ArrayList<Integer> coins(Integer...i) {
        return new ArrayList<>(Arrays.asList(i));
    }

    @Test
    public void changeFor1() {
        assertEquals(coins(1), CoinChanger.giveChange(1));
    }

    @Test
    public void changeFor2() {
        assertEquals(coins(1,1), CoinChanger.giveChange(2));

    }

    @Test
    public void changeFor3() {
        assertEquals(coins(1,1,1), CoinChanger.giveChange(3));

    }

    @Test
    public void changeFor5() {
        assertEquals(coins(5), CoinChanger.giveChange(5));

    }
}