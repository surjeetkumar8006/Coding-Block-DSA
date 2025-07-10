package DSA_QUESTION_CODING_BLOCK;

public class Rtete_array {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
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
        for (int i = 1; i <= k; i++) {
            int item = arr[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = item;
        }

    }

}
