package DSA_QUESTION_CODING_BLOCK;

import java.util.*;

public class Rain_Water_Trapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(traping(arr));
        sc.close();
    }

    public static int traping(int[] arr) {

        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int sum = 0;
        // Left Max
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        // sum

        for (int i = 0; i < n; i++) {
            sum += Math.min(left[i], right[i]) - arr[i];
        }
        return sum;
    }
}
    