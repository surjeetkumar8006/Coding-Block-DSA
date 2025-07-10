import java.util.*;

public class Invert_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] inv = new int[N];
        inverseArray(arr, inv, 0);

        // Print the inverted array
        for (int i = 0; i < N; i++) {
            System.out.print(inv[i] + " ");
        }
    }

    // Recursive function to inverse the array
    public static void inverseArray(int[] arr, int[] inv, int index) {
        if (index == arr.length) {
            return;
        }

        int val = arr[index];
        inv[val] = index;

        inverseArray(arr, inv, index + 1);
    }
}
