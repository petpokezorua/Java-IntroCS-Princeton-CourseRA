/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/9/2024
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int distance = 0;
        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("(0, 0)");
        while (distance < r) {
            double randDouble = Math.random();
            int random = (int) (randDouble  * 4);
            if (random == 0) {
                x += 1;
            }
            if (random == 1) {
                y += 1;
            }
            if (random == 2) {
                x -= 1;
            }
            if (random == 3) {
                y -= 1;
            }

            distance = Math.abs(x) + Math.abs(y);
            steps += 1;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}
