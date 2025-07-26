import java.util.*;

public class ParathaCooking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();        // Number of paranthas
        int L = sc.nextInt();        // Number of cooks
        int[] ranks = new int[L];

        for (int i = 0; i < L; i++) {
            ranks[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(minTimeToCook(ranks, P));
    }

    // Function to calculate minimum time
    public static int minTimeToCook(int[] ranks, int P) {
        int start = 0;
        int end = getMaxTime(ranks, P); // max possible time
        int ans = end;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (canCookInTime(ranks, P, mid)) {
                ans = mid;
                end = mid - 1;  // try to find smaller time
            } else {
                start = mid + 1; // need more time
            }
        }
        return ans;
    }

    // Check if P paranthas can be cooked in 'time' minutes
    public static boolean canCookInTime(int[] ranks, int P, int time) {
        int count = 0;
        for (int rank : ranks) {
            int t = 0;
            int k = 1;
            while (t + k * rank <= time) {
                t += k * rank;
                count++;
                k++;
                if (count >= P) return true; // Enough paranthas cooked
            }
        }
        return count >= P;
    }

    // Max possible time if only the slowest cook does all cooking
    public static int getMaxTime(int[] ranks, int P) {
        int maxRank = Arrays.stream(ranks).max().getAsInt();
        return maxRank * (P * (P + 1)) / 2;
    }
}
