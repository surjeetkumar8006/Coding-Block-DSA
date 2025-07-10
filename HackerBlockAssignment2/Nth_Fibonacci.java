import java.util.*;
public class Nth_Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(fibonacci(N));
    }

    // Iterative method to find Nth Fibonacci number
    public static int fibonacci(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
