import java.lang.Math;
/*
    Question:
    (1) Implement the method private static long algA(long n) above and check your answer below.

    (2) Then use Eclipse to measure the running time of your implementation. Run your implementation with 𝑛 = 10³, 10⁴, 10⁵, ... 10⁸, 10⁹.

    (3) Using Python or Excel, plot 𝑛 on the 𝑥 axis and time on the 𝑦 axis.
    Ignoring any outliers, what do you notice about the graph?
*/

public class Lab1_Question1 {
    private static long algA(long n){
        int x = 0;
        long startTime = System.nanoTime();
        for (int i = 2; i <= n; i += 2) {
            x += i;
        }
        long endTime = System.nanoTime();
        System.out.println("Time: " + (endTime - startTime) + " ns");
        return x;
    }
    public static void main(String[] args) {
        for (double i = 3; i < 10; ++i) {
            long n = (long) Math.pow(10, i);
            System.out.println("algA result: " + algA(n));
        }
    }
}
