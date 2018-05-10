package ingvar.sandbox.hackerrank.diagonaldiff;

import ingvar.sandbox.hackerrank.Solution;

import java.security.SecureRandom;

import static ingvar.sandbox.hackerrank.util.ConsoleWriter.outln;

public class DiagonalDiffSolution implements Solution {

    @Override
    public String name() {
        return "Diagonal Difference";
    }

    /**  **/
    @Override
    public void solve() {
        final int dimSize = 3;
        int[][] matrix = generateMatrix(dimSize);
        int diff = diagonalDifference(matrix);

        outln("Diagonal difference : %d", diff);
    }

    /**  **/
    private int diagonalDifference(int[][] a) {
        int sum1 = 0, sum2 = 0;
        int dim = a.length;

        /* Diagonal 1 */
        for (int x = 0, y = 0; x < dim; ++x, ++y) {
            sum1 += a[x][y];
        }
        outln("Diagonal 1 sum : %d", sum1);

        /* Diagonal 2 */
        for (int x = 0, y = dim - 1; x < dim; ++x, --y) {
            sum2 += a[x][y];
        }
        outln("Diagonal 2 sum : %d", sum2);

        return Math.abs(sum1 - sum2);
    }

    /**  **/
    private int[][] generateMatrix(final int dimSize) {
        int[][] matrix = new int[dimSize][dimSize];
        SecureRandom sr = new SecureRandom();
        byte[] row;

        for (int i = 0; i < dimSize; ++i) {
            row = new byte[dimSize];
            sr.nextBytes(row);

            for (int j = 0; j < dimSize; ++j) {
                matrix[i][j] = row[j];
            }
        }
        printMatrix(matrix);
        return matrix;
    }

    /**  **/
    private void printMatrix(int[][] matrix) {
        if (matrix != null) {
            StringBuilder sb = new StringBuilder("\n* * * * * * * * * *\n");
            for (int x = 0; x < matrix.length; ++x) {
                sb.append("* ");
                for (int y = 0; y < matrix[x].length; ++y) {
                    sb.append(String.format("%4d ", matrix[x][y]));
                }
                sb.append(" *\n");
            }
            sb.append("* * * * * * * * * *\n");
            outln(sb.toString());
        }
    }
}
