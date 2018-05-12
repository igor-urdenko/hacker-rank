package ingvar.sandbox.hackerrank.codinginterview;

import java.util.Scanner;

import static ingvar.sandbox.hackerrank.util.ConsoleWriter.arr2str;
import static ingvar.sandbox.hackerrank.util.ConsoleWriter.out;
import static ingvar.sandbox.hackerrank.util.ConsoleWriter.outln;

/**
 * A left rotation operation on an array of size {@code n} shifts each of the array's elements
 * {@code 1} unit to the left. For example, if {@code 2} left rotations are performed on array
 * {@code [ 1, 2, 3, 4, 5 ]}, then the array would become {@code [ 3, 4, 5, 1, 2 ]}.
 *
 * Given an array of {@code n} integers and a number, {@code d}, perform {@code d} left rotations on the array.
 * Then print the updated array as a single line of space-separated integers.
 *
 * Input Format
 * The first line contains two space-separated integers denoting the respective values of {@code n}
 * (the number of integers) and {@code d} (the number of left rotations you must perform).
 * The second line contains {@code n} space-separated integers describing the respective elements
 * of the array's initial state.
 *
 * Constraints
 * {@code 1 <= n <= 10<sup>5</sup> }
 * {@code 1 <= d <= n }
 * {@code 1 <= a<sub>i</sub> <= 10<sup>6</sup> }
 *
 * Output Format
 * Print a single line of {@code n} space-separated integers denoting the final state of the array
 * after performing  left rotations.
 *
 * Sample Input
 * 5 4
 * 1 2 3 4 5
 *
 * Sample Output
 * 5 1 2 3 4
 **/
public class ArraysLeftRotation {
    /*  */
    private static final Scanner scanner = new Scanner(System.in);

    /**  **/
    public static void main(String [] args) {
        out("Enter n and k : ");
        String [] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int [] a = new int[n];

        out("Enter n integers of the array : ");
        String [] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        scanner.close();
        leftRotation(a, k);
    }

    /**  **/
    private static void leftRotation(int [] arr, int k) {
        int [] new_arr = new int [arr.length];
        int new_idx = arr.length - k;

        for (int i = 0; i < arr.length; ++i) {
            if (new_idx == arr.length) {
                new_idx = 0;
            }
            new_arr[new_idx] = arr[i];
            new_idx++;
        }
        outln("Initial array : %s", arr2str(arr));
        outln("Result array  : %s", arr2str(new_arr));
    }
}
