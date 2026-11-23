import java.util.ArrayList;
/*
    Question:
    (1) Implement the method private static long algB(int[][] A, long m, long n) above and check your answer below.

    (2) Use Eclipse to measure the running time of your implementation using 𝑛 = 𝑚 = 100, 200, 300, 400 ... 800, 900. Populate 𝐴 with random values.

    (3) Using Python or Excel, plot 𝑛 on the 𝑥 axis and time on the 𝑦 axis.
    Ignoring any outliers, what do you notice about the graph?
*/
public class Lab1_Question2 {
        private static long algB(int[][] A, long m, long n) {
        long x = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] > x) {
                    x = A[i][j];
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        long m = 0;
        long n = 0;

        ArrayList<long[]> list = new ArrayList<>();

        // loop to populate with rand val

        // call algB and store result

        
    }
}
