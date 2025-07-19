import java.util.*;
public class Running_Sum_of_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        int n = sc.nextInt();

        // Create the input array
        int[] nums = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Calculate and print the running sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            System.out.print(sum + " ");
        }
    }
}