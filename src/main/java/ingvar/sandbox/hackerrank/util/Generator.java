package ingvar.sandbox.hackerrank.util;

import java.security.SecureRandom;

/**
 * Implements methods for generating necessary data.
 **/
public class Generator {
    /**
     * Generates an array of integers of the given size.
     *
     * @param n Size of the array.
     * @return Returns the generated array of integers of the given size.
     **/
    public static int [] intArr(int n) {
        final int [] arr = new int [n];
        SecureRandom rnd = new SecureRandom();
        byte [] generatedNumbers = new byte[n];

        rnd.nextBytes(generatedNumbers);
        for (int idx = 0; idx < n; ++idx) {
            arr[idx] = generatedNumbers[idx];
        }
        return arr;
    }
}
