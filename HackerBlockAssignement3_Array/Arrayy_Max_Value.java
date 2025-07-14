import java.util.*;

public class Arrayy_Max_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size of array
        int n = sc.nextInt();

        // Step 2: Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Max_Value(arr));

    }

   public static int Max_Value(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) { 
            max = arr[i];
        }
    }
    return max;
}


}