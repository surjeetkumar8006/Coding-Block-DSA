import java.util.*;

public class Search_a_2D_Matrix_II {
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
        int target = sc.nextInt();
        System.out.println(Search_2D_Matrix_II(arr, target));

    }

    public static boolean Search_2D_Matrix_II(int[][] arr, int target) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (arr[i][j] == target) {
        // return true;
        // }
        // }
        // }
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >=0) {
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void display(int[][] arr) {
        // output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
