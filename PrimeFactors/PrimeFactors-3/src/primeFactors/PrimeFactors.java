package primeFactors;

import java.util.*;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        int candidate = 2;
        while (n%candidate == 0) {
            primes.add(candidate);
            n /= candidate;
        }
        if (n > 1) {
            primes.add(n);

        }
        return primes;
    }
}
