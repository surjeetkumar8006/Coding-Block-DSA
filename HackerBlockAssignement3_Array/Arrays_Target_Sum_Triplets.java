import java.util.*;

public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[][] result = findAllTriplets(nums, target);
        boolean found = false;
        for (int i = 0; i < result.length && result[i][0] != Integer.MAX_VALUE; i++) {
            found = true;
            System.out.println(result[i][0] + ", " + result[i][1] + " and " + result[i][2]);
        }
    }

    public static int[][] findAllTriplets(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] triplets = new int[n * n][3]; // dynamically larger based on N
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    triplets[count][0] = nums[i];
                    triplets[count][1] = nums[left];
                    triplets[count][2] = nums[right];
                    count++;
                    int l = nums[left], r = nums[right];
                    while (left < right && nums[left] == l)
                        left++;
                    while (left < right && nums[right] == r)
                        right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        if (count < triplets.length) {
            triplets[count][0] = Integer.MAX_VALUE; // end marker
        }

        return triplets;
    }
}
