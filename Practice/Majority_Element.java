public class Majority_Element {

    public static void main(String[] args) {
        // Example input array
        int[] nums1 = { 3, 2, 3 };
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };

        // Test case 1
        int result1 = majorityElement(nums1);
        System.out.println("Majority element in nums1: " + result1);

        // Test case 2
        int result2 = majorityElement(nums2);
        System.out.println("Majority element in nums2: " + result2);
    }

    // ✅ Moore's Voting Algorithm
    public static int majorityElement(int[] nums) {
        int n = nums.length;

        for (int val : nums) {
            int count = 0;

            for (int el : nums) {
                if (val == el) {
                    count++;
                }
            }

            if (count > n / 2) {
                return val;
            }

        }
        return -1;
    }
}
