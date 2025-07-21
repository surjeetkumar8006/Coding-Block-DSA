
import java.util.*;

public class A_Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // number of rows
        int n = sc.nextInt(); // number of columns
        int[][] mat = new int[m][n];

        // Input the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // First pass to mark rows and columns that need to be set to 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Second pass to update the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 1;
                }
            }
        }

        // Output the modified matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
                if (j != n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

