import java.util.*;

public class Pair_of_Roses {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt(); // Number of test cases

            while (T-- > 0) {
                int n = sc.nextInt(); // Number of roses
                int[] prices = new int[n];

                for (int i = 0; i < n; i++) {
                    prices[i] = sc.nextInt();
                }

                int money = sc.nextInt(); // Total money Deepak has

                // Sort prices for two pointer approach
                Arrays.sort(prices);

                int left = 0, right = n - 1;
                int price1 = 0, price2 = 0;
                int minDiff = Integer.MAX_VALUE;

                while (left < right) {
                    int sum = prices[left] + prices[right];

                    if (sum == money) {
                        int diff = prices[right] - prices[left];
                        if (diff < minDiff) {
                            price1 = prices[left];
                            price2 = prices[right];
                            minDiff = diff;
                        }
                        // Keep checking for smaller difference
                        left++;
                        right--;
                    } else if (sum < money) {
                        left++;
                    } else {
                        right--;
                    }
                }

                System.out.println("Deepak should buy roses whose prices are " + price1 + " and " + price2 + ".\n");
            }
        }
}
