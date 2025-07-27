import java.util.*;

public class CBNumber {
    static int[] cbPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        System.out.println(getMaxCBNumbers(s));
    }

    // Check if the number is a CB number
    public static boolean isCBNumber(long num) {
        if (num == 0 || num == 1) return false;
        for (int prime : cbPrimes) {
            if (num == prime) return true;  // directly a CB prime
        }
        for (int prime : cbPrimes) {
            if (num % prime == 0) return false;  // divisible by any prime
        }
        return true;
    }

    // Check if this substring overlaps with an already selected CB number
    public static boolean isValid(boolean[] visited, int start, int end) {
        for (int i = start; i < end; i++) {
            if (visited[i]) return false;
        }
        return true;
    }

    // Main function to calculate max CB numbers
    public static int getMaxCBNumbers(String s) {
        int n = s.length();
        boolean[] visited = new boolean[n];
        int count = 0;

        // Check all substring lengths from 1 to n
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                int end = start + len;
                long num = Long.parseLong(s.substring(start, end));

                if (isCBNumber(num) && isValid(visited, start, end)) {
                    count++;
                    for (int i = start; i < end; i++) {
                        visited[i] = true; // mark this substring as taken
                    }
                }
            }
        }
        return count;
    }
}
