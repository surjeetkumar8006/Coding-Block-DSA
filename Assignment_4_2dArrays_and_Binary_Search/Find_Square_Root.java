import java.util.Scanner;

public class Find_Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(sqrt(x));
        sc.close();
    }

    public static long sqrt(long x) {
        if (x == 0 || x == 1) return x;

        long low = 0, high = x, ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sq = mid * mid;

            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;  // mid is a candidate
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;  // floor of sqrt(x)
    }
}
