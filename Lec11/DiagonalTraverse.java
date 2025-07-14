import java.util.*;

public class DiagonalTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        // Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] result = DiagonalTraverse(arr);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static int[] DiagonalTraverse(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];

        int row = 0, col = 0;
        int dir = 1; // 1 = up, -1 = down
        int idx = 0;

        while (idx < m * n) {
            res[idx++] = mat[row][col];

            // Move in current direction
            if (dir == 1) { // going up
                if (col == n - 1) {
                    row++;
                    dir = -1;
                } else if (row == 0) {
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            } else { // going down
                if (row == m - 1) {
                    col++;
                    dir = 1;
                } else if (col == 0) {
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return res;
    }
}
