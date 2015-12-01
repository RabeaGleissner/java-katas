import java.util.ArrayList;
import java.util.List;

public class CoinChanger {

    public static List<Integer> giveChange(int amount) {

        List<Integer> change = new ArrayList<>();
        int[] AVAILABLE_COINS = {100, 50, 25, 10, 5, 1};

        for (int i = 0; i < AVAILABLE_COINS.length; i++) {
            while (amount >= AVAILABLE_COINS[i]) {
                change.add(AVAILABLE_COINS[i]);
                amount -= AVAILABLE_COINS[i];
            }
        }
        return change;
    }
}
