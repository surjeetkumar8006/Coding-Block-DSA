import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        int[] result = four(nums, target);

        if (result.length == 4) {
            System.out.println("Quadruplet: " + Arrays.toString(result));
        } else {
            System.out.println("No quadruplet found");
        }
    }

    public static int[] four(int[] nums, int target) {
        Arrays.sort(nums); // Step 1: Sort the array

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // Skip duplicates for i

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue; // Skip duplicates for j

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int total = nums[i] + nums[j] + nums[left] + nums[right];

                    if (total == target) {
                        return new int[] { nums[i], nums[j], nums[left], nums[right] };
                    } else if (total < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return new int[] {}; // No quadruplet found
    }
}
