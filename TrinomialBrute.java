/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/21/2024
 **************************************************************************** */

// This program is a brute-force recursion approach for the problem of Trinomial Coefficient.
public class TrinomialBrute {
    public static long trinomial(int n, int k) {
        if (n == 0 && k == 0) {
            return 1;
        }
        if (k < -n || k > n) {
            return 0;
        }

        return trinomial(n - 1, k - 1) + trinomial(n - 1, k) + trinomial(n - 1, k + 1);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        System.out.println(trinomial(n, k));
    }
}
