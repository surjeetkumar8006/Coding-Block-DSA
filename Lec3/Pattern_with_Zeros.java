import java.util.*;

public class Pattern_with_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        int n = sc.nextInt();

        int row = 1; // Start from first row

        // Outer loop to print each row
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                if (col == 1 || col == row) {
                    // First or last column of each row → print row number
                    System.out.print(row + "\t");
                } else {
                    // In-between values → print 0
                    System.out.print("0\t");
                }
                col++;
            }

            // 3. Move to next line after printing all columns of current row
            System.out.println();

            // Go to next row
            row++;
        }

        sc.close(); // Close scanner
    }
}
