import java.util.*;

public class Spiral_Metrix {
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
        Print(arr);

    }

    public static void Print(int[][] arr) {

        int minr = 0, maxr = arr.length - 1;
        int minc = 0, maxc = arr[0].length - 1;
        int total = arr.length * arr[0].length;
        int c = 0;
        while (c < total) {
            for (int i = minc; i <= maxc && c < total; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr & c < total; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;
            }
            maxc--;
            for (int i = maxc; i >= minc && c < total; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c < total; i--) {
                System.out.print(arr[minc][i] + " ");
                c++;
            }
            minc++;

        }
    }
}
