import java.util.*;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Insertion_Last_element(arr, arr.length - 1);
        sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Insertion_Last_element(arr, i);
        }
    }

    public static void Insertion_Last_element(int[] arr, int i) {
        int item = arr[i];
        int j = i - 1;
        while (i >= 0 && arr[j] > item) {
            arr[j + 1] = arr[j];
            arr[j] = item;
            j--;
        }
        // Return j+1 correct Index
    }
}
