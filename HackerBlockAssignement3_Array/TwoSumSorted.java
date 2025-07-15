import java.util.*;

public class TwoSumSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // Array size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Array elements
        }

        int target = sc.nextInt();  // Target sum

        findTwoSum(arr, target);
    }

    public static void findTwoSum(int[] arr, int target) {
        Arrays.sort(arr); // Sort for two-pointer
        int left = 0, right = arr.length - 1;

        Set<String> seen = new HashSet<>();

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                String pair = arr[left] + " and " + arr[right];
                if (!seen.contains(pair)) {
                    System.out.println(pair);
                    seen.add(pair);
                }
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
