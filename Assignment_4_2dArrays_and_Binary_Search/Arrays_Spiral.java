import  java.util.*;
public class Arrays_Spiral {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // Rows
        int n = sc.nextInt(); // Columns

        int[][] arr = new int[m][n];

        // Read the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Spiral anti-clockwise print
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        int count = 0;
        int total = m * n;

        while (count < total) {
            // Print left column (top to bottom)
            for (int i = top; i <= bottom && count < total; i++) {
                System.out.print(arr[i][left] + ", ");
                count++;
            }
            left++;

            // Print bottom row (left to right)
            for (int i = left; i <= right && count < total; i++) {
                System.out.print(arr[bottom][i] + ", ");
                count++;
            }
            bottom--;

            // Print right column (bottom to top)
            for (int i = bottom; i >= top && count < total; i--) {
                System.out.print(arr[i][right] + ", ");
                count++;
            }
            right--;

            // Print top row (right to left)
            for (int i = right; i >= left && count < total; i--) {
                System.out.print(arr[top][i] + ", ");
                count++;
            }
            top++;
        }

        System.out.println("END");
    }
}
