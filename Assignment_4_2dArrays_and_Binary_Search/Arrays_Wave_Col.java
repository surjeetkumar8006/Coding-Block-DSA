import  java.util.*;
public class Arrays_Wave_Col {
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

        // Wave print column-wise
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                // Top to bottom
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else {
                // Bottom to top
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }

        System.out.println("END");
        sc.close();
    }
}
