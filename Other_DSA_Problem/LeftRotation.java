package DSA;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        left(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void left(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        Reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining elements
        Reverse(arr, k, n - 1);

        // Step 3: Reverse the entire array
        Reverse(arr, 0, n - 1);
    }

    public static void Reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
