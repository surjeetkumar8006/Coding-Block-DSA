import java.util.*;

public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: Array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input: Target
        int target = sc.nextInt();

        // Find and print all valid triplets
        findTriplets(arr, target);
    }

    public static void findTriplets(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        Set<String> UniqueTriplet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    int a = arr[i], b = arr[j], c = arr[k];
                    String triplet = a + ", " + b + " and " + c;
                    UniqueTriplet.add(triplet);
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }

        }
        for (String triplet : UniqueTriplet) {
            System.out.println(triplet);
        }
    }
}
