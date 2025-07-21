import java.util.*;

public class KTH_ROOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases
        while (T-- > 0) {
            long n = sc.nextLong(); // value of n
            int k = sc.nextInt();   // value of k

            System.out.println(findMaxX(n, k));
        }
        sc.close();
    }

    // Function to find the largest x such that x^k <= n
    public static long findMaxX(long n, int k) {
        long low = 1, high = n;
        long ans = 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isPowerLessEqual(mid, k, n)) {
                ans = mid;
                low = mid + 1; // try for a bigger x
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Function to compute x^k <= n safely
    public static boolean isPowerLessEqual(long x, int k, long n) {
        long res = 1;
        for (int i = 0; i < k; i++) {
            if (res > n / x) return false; // early overflow detection
            res *= x;
        }
        return true;
    }
}

