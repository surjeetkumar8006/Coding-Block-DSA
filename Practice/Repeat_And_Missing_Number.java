import java.util.*;

public class Repeat_And_Missing_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input grid size (n x n)
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        // Read n x n matrix input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Call the solution function
        int[] result = findMissingAndRepeatedValues(grid);

        // Output
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        int size = n * n;
        boolean[] seen = new boolean[size + 1]; // index 1 to n*n

        int duplicate = -1;
        int missing = -1;

        // Step 1: Find the duplicate value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                if (seen[val]) {
                    duplicate = val;
                } else {
                    seen[val] = true;
                }
            }
        }

        // Step 2: Find the missing value
        for (int i = 1; i <= size; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return new int[] { duplicate, missing };
    }
}
