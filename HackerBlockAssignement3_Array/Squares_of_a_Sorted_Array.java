import java.util.*;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();             // Length of the array
        int[] nums = new int[n];          // Original input array

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sortedSquares(nums);

        // Output the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                ans[index--] = leftSq;
                left++;
            } else {
                ans[index--] = rightSq;
                right--;
            }
        }

        return ans;
    }
}

