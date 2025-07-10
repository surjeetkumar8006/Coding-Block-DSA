import java.util.*;

public class Fibonacci_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        int n = sc.nextInt();

        int a = 0; // first fibonacci number
        int b = 1; // second fibonacci number

        int row = 1;

        // Loop through rows
        while (row <= n) {
            int col = 1;

            // Print 'row' fibonacci numbers in this row
            while (col <= row) {
                System.out.print(a + "\t"); // Print current Fibonacci number

                // Generate next Fibonacci number
                int c = a + b;
                a = b;
                b = c;

                col++;
            }

            System.out.println(); // Move to next line after row is printed
            row++;
        }

        sc.close();
    }
}
