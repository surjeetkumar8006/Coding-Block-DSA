import java.util.*;

public class Arrays_Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size of array
        int n = sc.nextInt();

        // Step 2: Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Input the item to search
        int item = sc.nextInt();

        // Step 4: Call search and print result
        System.out.println(Search(arr, item));
    }

    public static int Search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i; // return index
            }
        }
        return -1; // not found
    }
}
