import java.util.*;

public class Alex_Goes_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] inputPrices = new int[n];
        for (int i = 0; i < n; i++) {
            inputPrices[i] = sc.nextInt();
        }

        // Step 1: Remove duplicates manually by sorting
        Arrays.sort(inputPrices);

        // Step 2: Create array of unique prices
        int[] prices = new int[n];
        int uniqueCount = 0;
        prices[uniqueCount++] = inputPrices[0];

        for (int i = 1; i < n; i++) {
            if (inputPrices[i] != inputPrices[i - 1]) {
                prices[uniqueCount++] = inputPrices[i];
            }
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int A = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;

            for (int i = 0; i < uniqueCount; i++) {
                if (A % prices[i] == 0) {
                    count++;
                    if (count >= k) break; // Early exit
                }
            }

            System.out.println(count >= k ? "Yes" : "No");
        }
    }
}
