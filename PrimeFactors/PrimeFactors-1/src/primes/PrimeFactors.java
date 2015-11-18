package primes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rabeagleissner on 18/11/2015.
 */
public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        if (n > 1) {
            int candidate = 2;
            while (n%candidate == 0) {
                primes.add(candidate);
                n /= candidate;
            }
            if (n > 1)
                primes.add(n);
        }
        return primes;
    }
}
