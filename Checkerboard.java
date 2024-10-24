/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/16/2024
 **************************************************************************** */

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                }
                else {
                    StdDraw.setPenColor(StdDraw.BLUE);
                }
                // Gotta center the square at i / j + 0.5 and halfLength 0.5 i guess.
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
