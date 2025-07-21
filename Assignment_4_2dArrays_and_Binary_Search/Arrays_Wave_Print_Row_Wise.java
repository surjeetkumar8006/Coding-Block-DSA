import java.util.*;
public class Arrays_Wave_Print_Row_Wise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input dimensions
        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); // columns

        int[][] arr = new int[m][n];
        
        // Input matrix values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Wave print row-wise
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                // left to right
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else {
                // right to left
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        
        System.out.println("END");
        sc.close();
    }
}
