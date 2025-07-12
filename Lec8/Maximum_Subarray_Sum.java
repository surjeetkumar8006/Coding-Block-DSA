import java.util.*;

public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // Insertion_Last_element(arr, arr.length - 1);
        System.out.println(maxSubArray(arr));

    }

    public static int maxSubArray(int[] arr) {
        // int n = arr.length;
        // int ans = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) {
        // int cSum = 0;
        // for (int j = i; j < n; j++) {
        // cSum += arr[j];
        // ans = Math.max(ans, cSum);
        // }
        // }
        // return ans;
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int cSum = 0;
        for (int i = 0; i < n; i++) {
            cSum += arr[i];
            ans = Math.max(ans, cSum);
            if (cSum < 0) {
                cSum = 0;
            }
        }
        return ans;
    }

}
