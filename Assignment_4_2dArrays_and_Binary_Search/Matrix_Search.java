import java.util.*;

public class Matrix_Search {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        // Input matrix dimensions
        int m = scn.nextInt();
        int n = scn.nextInt();

        // Initialize matrix
        int[][] arr = new int[m][n];

        // Input matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // Element to search
        int k = scn.nextInt();

        // Search and print result
        System.out.print(searchMatrix(arr, k));
        scn.close();
    }

    public static int searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from top-right corner
        int i = 0, j = cols - 1;

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return 1;
            } else if (matrix[i][j] > target) {
                j--; // move left
            } else {
                i++; // move down
            }
        }

        return 0; // not found
    }
}

