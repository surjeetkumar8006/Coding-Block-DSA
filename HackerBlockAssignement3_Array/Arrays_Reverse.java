import java.util.*;

public class Arrays_Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input N
        int n = sc.nextInt();

        // Step 2: Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Replace(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void Replace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
