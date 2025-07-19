public class Calculate_The_Sum {
    static final int MOD = 1000000007;

    // Function to compute (base^exp) % MOD using binary exponentiation
    public static long powerMod(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;

        // Read array and calculate initial sum
        for (int i = 0; i < N; i++) {
            sum = (sum + sc.nextLong()) % MOD;
        }

        int Q = sc.nextInt();  // number of operations

        // Skip reading individual X values because they do not affect the sum directly
        for (int i = 0; i < Q; i++) {
            sc.nextInt();  // skip the value, unnecessary for computation
        }

        long multiplier = powerMod(2, Q, MOD);
        long finalSum = (sum * multiplier) % MOD;

        System.out.println(finalSum);
    }
}
