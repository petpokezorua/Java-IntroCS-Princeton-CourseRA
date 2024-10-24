/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/22/2024
 **************************************************************************** */

// This program will draw the squares recursively in an order of command line input.
public class RecursiveSquares {
    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, length / 2);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, length / 2);
    }

    public static void draw(int n, double x, double y, double length) {
        // Base case.
        if (n == 0) {
            return;
        }

        // We'll be basically drawing the big squares first, and develop through every branch/order of it.
        drawSquare(x, y, length);
        double x0 = x - length / 2, x1 = x + length / 2;
        double y0 = y - length / 2, y1 = y + length / 2;

        // Recursively drawing the pattern from left-right, up-down.
        draw(n - 1, x1, y0, length / 2);
        draw(n - 1, x1, y1, length / 2);
        draw(n - 1, x0, y0, length / 2);
        draw(n - 1, x0, y1, length / 2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        draw(n, 0.5, 0.5, 0.5);
    }
}
