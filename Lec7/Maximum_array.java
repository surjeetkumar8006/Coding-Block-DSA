package Lec7;

public class Maximum_array {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };

        System.out.println(Maximum(arr));
    }

    public static int Maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static int Maximum1(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            // if (arr[i] > max) {
            // max = arr[i];
            // }
        }
        return max;

    }
}
