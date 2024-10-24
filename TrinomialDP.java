/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/22/2024
 **************************************************************************** */

// This program utilizes dynamic programming to solve the problem of Trinomial Coefficients.
public class TrinomialDP {
    public static long trinomial(int n, int k) {
        if (k < -n || k > n) {
            return 0;
        }
        else if (k == n) {
            return 1;
        }
        else {
            k = Math.abs(k);
            long[][] arr = new long[n + k + 1][k + n + 1];
            arr[0][0] = 1;

            for (int i = 1; i <= n + k; i++) {
                for (int j = 0; j < n + k; j++) {
                    if (j == 0) {
                        arr[i][j] = 2 * arr[i - 1][j + 1] + arr[i - 1][j];
                    }
                    else {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1];
                    }
                }
            }
            return arr[n][k];
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}
