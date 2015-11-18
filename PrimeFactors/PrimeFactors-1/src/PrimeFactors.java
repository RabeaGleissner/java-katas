import java.util.ArrayList;
import java.util.List;

/**
 * Created by rabeagleissner on 18/11/2015.
 */
public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        if (n > 1) {
            primes.add(2);
        }
        return primes;
    }
}
