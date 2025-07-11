import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(min_form_ith_index(arr, 2));
        sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int mini = min_form_ith_index(arr, i);
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
    public static int min_form_ith_index(int[] arr, int index) {
        int mini = index;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < arr[mini]) {
                mini = i;
            }
        }
        return mini;
    }
}
