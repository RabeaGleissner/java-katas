import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CoinChangerTest {

    private ArrayList<Integer> coins(Integer...i) {
        return new ArrayList<>(Arrays.asList(i));
    }

    @Test
    public void changeForOne() {
        assertEquals(coins(1), CoinChanger.giveChange(1));
    }

    @Test
    public void changeForTwo() {
        assertEquals(coins(1,1), CoinChanger.giveChange(2));

    }

    @Test
    public void changeForThree() {
        assertEquals(coins(1,1,1), CoinChanger.giveChange(3));

    }

    @Test
    public void changeForFive() {
        assertEquals(coins(5), CoinChanger.giveChange(5));

    }
}