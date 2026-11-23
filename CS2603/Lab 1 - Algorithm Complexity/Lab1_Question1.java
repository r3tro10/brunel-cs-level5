import java.lang.Math;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    Question:
    (1) Implement the method private static long algA(long n) above and check your answer below.

    (2) Then use Eclipse to measure the running time of your implementation. Run your implementation with 𝑛 = 10³, 10⁴, 10⁵, ... 10⁸, 10⁹.

    (3) Using Python or Excel, plot 𝑛 on the 𝑥 axis and time on the 𝑦 axis.
    Ignoring any outliers, what do you notice about the graph?
*/

public class Lab1_Question1 {
    private static long algA(long n) {
        long x = 0;
        for (long i = 2; i <= n; i += 2) {
            x += i;
        }
        return x;
    }
    public static void main(String[] args) {
        String filename = "Lab 1 - Algorithm Complexity/algA_results.csv";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("n,elapsed");
            writer.newLine();

            for (int i = 3; i <= 9; ++i) {
                long n = (long) Math.pow(10, i);

                long startTime = System.nanoTime();
                long result = algA(n);
                long endTime = System.nanoTime();

                long elapsed = endTime - startTime;

                writer.write(n + "," + elapsed);
                writer.newLine();

                System.out.println("n = " + n + ", result = " + result + ", time = " + elapsed + "ns");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
