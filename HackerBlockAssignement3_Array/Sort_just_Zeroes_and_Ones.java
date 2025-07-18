import java.util.*;

public class Sort_just_Zeroes_and_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Array to store binary numbers
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count number of 0s
        int countZero = 0;
        for (int num : arr) {
            if (num == 0) {
                countZero++;
            }
        }

        // Print sorted array: first all 0s, then all 1s
        for (int i = 0; i < countZero; i++) {
            System.out.print("0 ");
        }
        for (int i = countZero; i < n; i++) {
            System.out.print("1 ");
        }

        sc.close();
    }
}
