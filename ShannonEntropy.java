/* *****************************************************************************
 *  Name:              Huu Hoang Ho
 *  Coursera User ID:  123456
 *  Last modified:     10/16/2024
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int sequenceLimit = Integer.parseInt(args[0]);
        double entropy = 0.0;
        int count = 0;
        int[] frequencies = new int[sequenceLimit];
        // While the file isn't empty
        while (!StdIn.isEmpty()) {
            // Read the int
            int data = StdIn.readInt();
            count += 1;
            frequencies[data - 1] += 1;
        }

        for (int i = 0; i < sequenceLimit; i++) {
            double proportion = (double) frequencies[i] / count;
            if (frequencies[i] == 0) {
                continue;
            }
            entropy += proportion * (Math.log(proportion) / Math.log(2));
        }

        entropy = -entropy;
        StdOut.printf("%.4f\n", entropy);
    }
}
