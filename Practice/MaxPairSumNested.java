public class MaxPairSumNested {
    public static void main(String[] args) {
        int[] nums1 = { 112, 131, 411 };
        int[] nums2 = { 2536, 1613, 3366, 162 };
        int[] nums3 = { 51, 71, 17, 24, 42 };

        System.out.println(maxSum(nums1)); // Output: -1
        System.out.println(maxSum(nums2)); // Output: 5902
        System.out.println(maxSum(nums3)); // Output: 88
    }

    public static int maxSum(int[] nums) {
        int maxSum = -1;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int maxDigitI = getMaxDigit(nums[i]);
            for (int j = i + 1; j < n; j++) {
                int maxDigitJ = getMaxDigit(nums[j]);

                if (maxDigitI == maxDigitJ) {
                    int sum = nums[i] + nums[j];
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum;
    }

    // Helper function to get largest digit of a number
    public static int getMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            maxDigit = Math.max(maxDigit, num % 10);
            num /= 10;
        }
        return maxDigit;
    }
}
