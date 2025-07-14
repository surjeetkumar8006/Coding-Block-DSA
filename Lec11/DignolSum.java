import java.util.*;

public class DignolSum {
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
        System.out.println(diagnol_sum(arr));
    }

    public static int diagnol_sum(int[][] arr) {
        int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (i == j) {
        // sum += arr[i][j];
        // } else if (i + j == arr.length-1) {
        // sum += arr[i][j];
        // }
        // }
        // }
        // return sum;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (i != arr.length - i - 1) {
                sum += arr[i][arr.length - i - 1];
            }
        }
        return sum;
    }
}
