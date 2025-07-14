import java.util.*;

public class Arrays_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Input N
        int n = sc.nextInt();
        
        // Step 2: Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Step 3: Input target sum
        int target = sc.nextInt();
        
        // Step 4: Print pairs
        printTargetSumPairs(arr, target);
    }

    public static void printTargetSumPairs(int[] arr, int target) {
        // Optional: Sort array for consistent increasing order in output
        Arrays.sort(arr);

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}
