/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/23/2024
 **************************************************************************** */

public class MaximumSquareSubmatrix {
    public static int size(int[][] a) {
        int matrixSize = 0;
        int size = a.length;
        int[][] dp = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = a[i][j];
                }
                else if (a[i][j] == 0) {
                    dp[i][j] = 0;
                }
                else {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    if (matrixSize < dp[i][j]) {
                        matrixSize = dp[i][j];
                    }
                }
            }
        }
        return matrixSize;
    }

    public static void main(String[] args) {
        int sizeArr = StdIn.readInt();
        int[][] a = new int[sizeArr][sizeArr];
        // Populating the array
        for (int i = 0; i < sizeArr; i++) {
            for (int j = 0; j < sizeArr; j++) {
                a[i][j] = StdIn.readInt();
            }
        }
        System.out.println(size(a));
    }
}
