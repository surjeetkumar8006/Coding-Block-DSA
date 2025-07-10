public class removeElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 4, 3, 3 };
        int val = 3;
        int k = removeElement(nums, val); // Call static method

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // ✅ Make this static
    public static int removeElement(int[] num, int val) {
        int k = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val) {
                num[k] = num[i];
                k++;
            }
        }
        return k;
    }
}
