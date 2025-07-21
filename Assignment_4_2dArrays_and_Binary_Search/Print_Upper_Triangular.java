import java.util.Scanner;

public class Print_Upper_Triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        // Input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Print upper triangle with original elements and lower triangle with 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(0);
                }
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}

