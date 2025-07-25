import java.util.*;;
public class Arrays_Spiral_clock {
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
            // top row
            for (int i = minc; i <= maxc && c < total; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;

            // right column
            for (int i = minr; i <= maxr && c < total; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;
            }
            maxc--;

            // bottom row
            for (int i = maxc; i >= minc && c < total; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;
            }
            maxr--;

            // left column
            for (int i = maxr; i >= minr && c < total; i--) {
                System.out.print(arr[i][minc] + " ");
                c++;
            }
            minc++;
        }
    }
}
