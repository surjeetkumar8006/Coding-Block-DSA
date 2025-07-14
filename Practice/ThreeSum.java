import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 1, 2, 4, 6, 8, 3};
        int target = 10;

        int[][] result = findAllTriplets(nums, target);

        if (result.length > 0) {
            for (int i = 0; i < result.length; i++) {
                if (result[i][0] == Integer.MAX_VALUE) break; // end marker
                System.out.println(result[i][0] + ", " + result[i][1] + " and " + result[i][2]);
            }
        } else {
            System.out.println("No triplet found");
        }
    }

    public static int[][] findAllTriplets(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] triplets = new int[1000][3]; // max 1000 triplets
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate i values
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    // Store triplet
                    triplets[count][0] = nums[i];
                    triplets[count][1] = nums[left];
                    triplets[count][2] = nums[right];
                    count++;

                    // Skip duplicate left/right
                    int l = nums[left], r = nums[right];
                    while (left < right && nums[left] == l) left++;
                    while (left < right && nums[right] == r) right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // End marker to avoid printing garbage
        if (count < triplets.length) {
            triplets[count][0] = Integer.MAX_VALUE;
        }

        return triplets;
    }
}
