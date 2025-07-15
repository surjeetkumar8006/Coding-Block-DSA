import java.util.*;

public class Four_sum {
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

        // Find and print all valid quadruplets
        findQuadruplets(arr, target);
    }

    public static void findQuadruplets(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        Set<String> uniqueQuads = new LinkedHashSet<>();

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == target) {
                        int a = arr[i], b = arr[j], c = arr[left], d = arr[right];
                        String quad = a + ", " + b + ", " + c + " and " + d;
                        uniqueQuads.add(quad);

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

        // Print all unique quadruplets
        for (String quad : uniqueQuads) {
            System.out.println(quad);
        }
    }
}
