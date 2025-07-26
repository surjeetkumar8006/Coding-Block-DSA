import java.util.*;

public class PainterPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();  // Number of painters
        int N = sc.nextInt();  // Number of boards
        int[] boards = new int[N];
        for (int i = 0; i < N; i++) {
            boards[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(minTime(boards, K));
    }

    public static int minTime(int[] boards, int K) {
        int max = 0, sum = 0;
        for (int b : boards) {
            max = Math.max(max, b);
            sum += b;
        }

        int low = max; // at least the longest board time
        int high = sum; // at most all boards by one painter
        int ans = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canPaint(boards, K, mid)) {
                ans = mid;
                high = mid - 1; // try for smaller max time
            } else {
                low = mid + 1; // need more time
            }
        }
        return ans;
    }

    public static boolean canPaint(int[] boards, int K, int maxTime) {
        int painters = 1;
        int time = 0;
        for (int b : boards) {
            if (time + b <= maxTime) {
                time += b;
            } else {
                painters++;
                time = b;
                if (painters > K) return false;
            }
        }
        return true;
    }
}
