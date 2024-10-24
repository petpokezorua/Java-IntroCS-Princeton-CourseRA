/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/22/2024
 **************************************************************************** */

// This program is a simulation of Reve's puzzle, in which it is the Tower of Hanoi problem, but with
// 4 columns to work with.
public class RevesPuzzle {
    private static void hanoi(int n, int k, String from, String to, String temp) {
        if (n == k) return;
        // Case to keep track of the discs.
        // You want to stop the program whenever n is done moving the k + 1 disc.
        if (n == k + 1) {
            System.out.println("Move disc " + n + " from " + from + " to " + to);
            return;
        }

        hanoi(n - 1, k, from, temp, to);
        System.out.println("Move disc " + n + " from " + from + " to " + to);
        hanoi(n - 1, k, temp, to, from);

    }

    public static void revesPuzzle(int n, String from, String to, String temp1, String temp2) {
        if (n == 0) {
            return;
        }
        int k = (int) Math.round(n + 1 - Math.sqrt(2 * n + 1));
        revesPuzzle(k, from, temp1, to, temp2);
        hanoi(n, k, from, temp2, to);
        revesPuzzle(k, temp1, to, from, temp2);
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        revesPuzzle(n, "A", "D", "B", "C");
    }
}
