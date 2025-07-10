package DSA_QUESTION_CODING_BLOCK;

public class Partition_Array {
    public static void main(String[] args) {
        int[] arr = { 5, 0, 3, 8, 6 };
        System.out.println(partition(arr));
    }

    public static int partition(int[] nums) {
        int n = nums.length;
        int leftMax = nums[0];
        int totalMax = nums[0];
        int partitionIndex = 0;
        for (int i = 1; i < n; i++) {
            totalMax = Math.max(totalMax, nums[i]);
            if (nums[i] < leftMax) {
                partitionIndex = i;
                leftMax = totalMax;
            }
        }
        return partitionIndex + 1;

    }

}
