import java.util.*;

public class Wave_print {
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
        solution(arr);
        // display(arr);

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

    public static void solution(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            } else {
                for (int j = arr.length - 1; j > 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
