package comp1110.exam;

import java.util.ArrayList;
import java.io.*;
import java.util.List;

/**
 * COMP1110 Exam, Question 1.1
 */
public class Q1Factors {
    /**
     * This function takes a positive integer, n, and returns an array
     * of ints containing all prime factors of that integer in ascending order.
     * For example:
     * factors(6) returns {2, 3}
     * factors{7} returns {7}
     * factors{24} returns {2, 2, 2, 3}
     * <p>
     * If n is less than 2, an empty array is returned.
     *
     * @param n the number to factor
     * @return an array containing all prime factors of the number
     */
    public static int[] factors(int n) {
        // FIXME complete this method

        if (n<2) {
            return new int[0];
        }

        List<Integer> factorList = new ArrayList<>();

        // Start with the smallest prime factor
        for (int i = 2; i*i <= n; i++ ){
            while (n % i == 0 ){                 // check if n is divisible by i then repeating
                factorList.add(i);
                n /= i;                          // the result of n/i go back to the loop
            }
        }
        if (n > 1){                              // if the last result is still > 1 then itself is a prime factor
            factorList.add(n);
        }

        //Convert the ArrayList into Array
        int[] factorArray = new int[factorList.size()];

        for (int i = 0; i < factorList.size(); i++){
            factorArray[i] = factorList.get(i);
        }
        return factorArray;

    }
}


