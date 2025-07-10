import java.util.*;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Input
        int totalRows = 2 * N + 1;
        int row = 0;

        while (row < totalRows) {
            int val = (row <= N) ? row : totalRows - row - 1;

            // 1. Padding space on left for alignment
            int pad = Math.abs(N - row);
            int p = 0;
            while (p < pad) {
                System.out.print("  ");
                p++;
            }

            // 2. Left part: Decreasing from N to N - val
            int i = N;
            while (i >= N - val) {
                // Skip middle 0 in the center row
                if (row == N && i == 0) {
                    i--;
                    continue;
                }
                System.out.print(i + " ");
                i--;
            }

            // 3. Middle spaces
            int spaces = 2 * (N - val) - 1;
            int s = 0;
            while (s < spaces) {
                System.out.print("  ");
                s++;
            }

            // 4. Right part: Increasing from N - val to N
            int j = N - val;
            while (j <= N) {
                // Avoid duplicate when not center row
                if (spaces > 0 && j == N - val && row != N) {
                    j++;
                    continue;
                }
                System.out.print(j + " ");
                j++;
            }

            System.out.println();
            row++;
        }

        sc.close();
    }
}
