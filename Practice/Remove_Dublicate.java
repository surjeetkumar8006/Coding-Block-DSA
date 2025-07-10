class Remove_Dublicate {
    public static void main(String[] args) {
        int[] num = new int[7];
        num[0] = 0;
        num[1] = 1;
        num[2] = 1;
        num[3] = 1;
        num[4] = 2;
        num[5] = 2;
        num[6] = 3;
        System.out.println(mergeSortedArray(num));
    }

    public static int mergeSortedArray(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] < nums[j]) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;
                i++;
            }

        }
        return i+1;

    }

}