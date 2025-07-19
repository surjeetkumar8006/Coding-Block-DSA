import java.util.Scanner;

public class EmergencyRoomTriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] severity = new int[n];

        for (int i = 0; i < n; i++) {
            severity[i] = sc.nextInt();
        }

        // Apply Dutch National Flag algorithm
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (severity[mid] == 0) {
                swap(severity, low, mid);
                low++;
                mid++;
            } else if (severity[mid] == 1) {
                mid++;
            } else { // severity[mid] == 2
                swap(severity, mid, high);
                high--;
            }
        }

        // Output result
        for (int i = 0; i < n; i++) {
            System.out.println(severity[i]);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
