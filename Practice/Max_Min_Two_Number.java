class Max_Min_Two_Number {
    public static void main(String[] args) {
        int[] nums = { 4, 9, 6, 5, 2, 3 };
        int n = nums.length;
        System.out.println("The maximum element is:" + setMaxi(nums, n));
        System.out.println("The Minimum Element is:" + setMini(nums, n));
    }

    public static int setMini(int[] nums, int n) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] < mini) {
                mini = nums[i];
            }
        }
        return mini;
    }

    public static int setMaxi(int[] nums, int n) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > maxi) {
                maxi = nums[i];
            }
        }
        return maxi;
        
    }

}