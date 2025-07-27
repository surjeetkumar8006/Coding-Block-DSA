public class Count_Primes {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(Prime_Seive(n));
    }

    public static int Prime_Seive(int n) {
        if (n <= 2) {
            return 0;
        }
        int[] prime = new int[n];
        prime[0] = 1;// Not Prime
        prime[1] = 1;// Not Prime
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == 0) { // Ith number prime hia
                for (int j = 2; i * j < prime.length; j++) {
                    prime[i * j] = 1;
                }
            }
        }
        int c = 0;
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == 0) {
                c++;
            }
        }
        return c;
    }
}
