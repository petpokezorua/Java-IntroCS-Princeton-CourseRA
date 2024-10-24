/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/9/2024
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalCount = 0;
        for (int i = 0; i < trials; i++) {
            int distance = 0;
            int x = 0;
            int y = 0;
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
                totalCount += 1;
            }
        }
        double average = (double) totalCount / trials;
        System.out.println("average number of steps = " + average);
    }
}
