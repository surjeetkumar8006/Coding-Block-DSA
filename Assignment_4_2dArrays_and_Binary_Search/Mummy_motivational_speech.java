import java.util.*;

public class Mummy_motivational_speech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Read matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Check for lower triangular condition
        boolean isLowerTriangular = true;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != 0) {
                    isLowerTriangular = false;
                    break;
                }
            }
        }

        System.out.println(isLowerTriangular ? "true" : "false");
    }
}

