/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/23/2024
 **************************************************************************** */

public class Ramanujan {
    public static boolean isRamanujan(long n) {
        int count = 0;
        long a = 0;
        long b = 0;
        long c, d;
        for (int i = 1; i <= Math.cbrt(n); i++) {
            if (count == 0) {
                long bCube = (n - (i * i * i));
                b = (long) Math.cbrt(bCube);
                if ((b * b * b) == bCube) {
                    count += 1;
                    a = i;
                }
            }
            else if (count == 1) {
                long dCube = (n - (i * i * i));
                d = (long) Math.cbrt(dCube);
                if ((d * d * d) == dCube && (d != b && d != a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(isRamanujan(n));
    }
}
