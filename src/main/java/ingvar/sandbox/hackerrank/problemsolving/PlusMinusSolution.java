/*
 * Copyright (c) for the problem: Hacker Rank (https://www.hackerrank.com/challenges/plus-minus/problem)
 */
package ingvar.sandbox.hackerrank.problemsolving;

import static ingvar.sandbox.hackerrank.util.ConsoleWriter.arr2str;
import static ingvar.sandbox.hackerrank.util.ConsoleWriter.outln;
import static ingvar.sandbox.hackerrank.util.Generator.intArr;

/**
 * Solution implementation for Plus Minus problem.
 * <p>
 * Given an array of integers, calculate the fractions of its elements that are positive,
 * negative, and are zeros. Print the decimal value of each fraction on a new line.
 * <p>
 * Note: This challenge introduces precision problems. The test cases are scaled
 * to six decimal places, though answers with absolute error of up to  are acceptable.
 * <p>
 * Input Format
 * The first line contains an integer, {@code n}, denoting the size of the array.
 * The second line contains {@code n} space-separated integers describing an array of numbers
 * {@code arr(a0, a1, a2, ..., an-1 }.
 * <p>
 * Output Format
 * You must print the following 3 lines:
 * A decimal representing of the fraction of positive numbers in the array compared to its size.
 * A decimal representing of the fraction of negative numbers in the array compared to its size.
 * A decimal representing of the fraction of zeros in the array compared to its size.
 * <p>
 * Sample Input
 * 6
 * -4 3 -9 0 4 1
 * <p>
 * Sample Output
 * 0.500000
 * 0.333333
 * 0.166667
 * <p>
 * Explanation
 * There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
 * The proportions of occurrence are positive: 3/6 = 0.500000, negative: 2/6 = 0.333333 and zeros: 1/6 = 0.166667.
 **/
public class PlusMinusSolution implements Solution {
    /**  **/
    @Override
    public String name() {
        return "Plus Minus";
    }

    /**  **/
    @Override
    public void solve() {
        int[] arr = intArr(6);
        outln("Generated array : %s", arr2str(arr));

        plusMinus(arr);
    }

    /**
     * Problem solution.
     **/
    private void plusMinus(int[] arr) {
        int posCnt = 0;
        int negCnt = 0;
        int zerCnt = 0;

        for (int num : arr) {
            if (num > 0) {
                posCnt++;
            } else if (num == 0) {
                zerCnt++;
            } else {
                negCnt++;
            }
        }
        outln("%f", ((float) posCnt / arr.length));
        outln("%f", ((float) negCnt / arr.length));
        outln("%f", ((float) zerCnt / arr.length));
    }
}
