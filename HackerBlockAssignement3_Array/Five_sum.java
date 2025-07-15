import java.util.*;

public class Five_sum {
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

        // Find and print all valid 5-sum combinations
        findFiveSum(arr, target);
    }

    public static void findFiveSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr); // Sort to make A ≤ B ≤ C ≤ D ≤ E
        Set<String> uniqueQuints = new LinkedHashSet<>();

        for (int i = 0; i < n - 4; i++) {
            for (int j = i + 1; j < n - 3; j++) {
                for (int k = j + 1; k < n - 2; k++) {
                    int left = k + 1;
                    int right = n - 1;

                    while (left < right) {
                        int sum = arr[i] + arr[j] + arr[k] + arr[left] + arr[right];

                        if (sum == target) {
                            int a = arr[i], b = arr[j], c = arr[k], d = arr[left], e = arr[right];
                            String quint = a + ", " + b + ", " + c + ", " + d + " and " + e;
                            uniqueQuints.add(quint);

                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
        }

        // Print all unique quintuplets
        for (String quint : uniqueQuints) {
            System.out.println(quint);
        }
    }
}
