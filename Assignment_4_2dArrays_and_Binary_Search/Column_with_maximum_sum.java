import java.util.*;

public class Column_with_maximum_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // size of the square matrix
        int[][] matrix = new int[n][n];

        // Input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxColIndex = -1;

        // Calculate sum for each column
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum > maxSum) {
                maxSum = colSum;
                maxColIndex = j;  // store 0-based index
            }
        }

        // Output: 1-based column index and max sum
        System.out.println((maxColIndex + 1) + " " + maxSum);

        sc.close();
    }
}
