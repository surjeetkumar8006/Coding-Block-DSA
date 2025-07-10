import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 3, 4, 5, 0, 0 };
        int target = 12;

        int[] result = Three(nums, target);

        if (result.length == 3) {
            System.out.println("Triplet: " + Arrays.toString(result));
        } else {
            System.out.println("No triplet found");
        }
    }

    public static int[] Three(int[] nums, int target) {
        Arrays.sort(nums); // Step 1: Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];

                if (total == target) {
                    // Found a triplet, return it as int[]
                    return new int[] { nums[i], nums[left], nums[right] };
                } else if (total < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new int[] {}; // If no triplet found
    }
}
