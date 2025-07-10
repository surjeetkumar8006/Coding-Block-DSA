package DSA_QUESTION_CODING_BLOCK;

public class Reversle_Algorithm {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotete_array(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // sc.close();
    }

    public static void rotete_array(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        // Starting ke n-k element reverse karna hia
        Reverse(arr, 0, n - k - 1);
        // K element reverse karne hia
        Reverse(arr, n - k, n - 1);
        // All element reverse karne hai
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
