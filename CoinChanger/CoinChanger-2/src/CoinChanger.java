import java.util.ArrayList;
import java.util.List;

public class CoinChanger {

    public static List<Integer> giveChange(int amount) {

        List<Integer> change = new ArrayList<>();
        if (amount == 5) {
            change.add(5);
            amount -= 5;
        }
        while (amount >= 1) {
            change.add(1);
            amount -= 1;
        }
        return change;
    }
}
