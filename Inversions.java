/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/23/2024
 **************************************************************************** */

public class Inversions {
    public static long count(int[] a) {
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j])
                    count += 1;
            }
        }
        return count;
    }

    // n = length, k = inversions.
    public static int[] generate(int n, long k) {
        if (n == k && n == 0) {
            return new int[0];
        }
        int[] array = new int[n];
        int count = 0;
        int subtractor = 0;
        for (int i = 1; i <= n; i++) {
            if (k >= n - i && (n - i != 0) && count + (n - i) <= k) {
                array[i - 1] = n - 1 - subtractor;
                count += n - i;
                subtractor += 1;
            }
            else {
                array[i - 1] = i - 1 - subtractor;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] arr = generate(n, k);
        for (int i = 0; i < n; i++) {
            if (i < (n - 1))
                System.out.print(arr[i] + " ");
            else
                System.out.println(arr[i]);
        }
    }
}
