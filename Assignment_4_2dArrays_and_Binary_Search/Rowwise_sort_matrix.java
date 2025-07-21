import java.util.*;

public class Rowwise_sort_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt(); // number of rows
        int c = sc.nextInt(); // number of columns
        
        int[][] matrix = new int[r][c];
        
        // Input matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Sort each row
        for (int i = 0; i < r; i++) {
            Arrays.sort(matrix[i]);
        }
        
        // Output sorted matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]);
                if (j != c - 1) System.out.print(" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
