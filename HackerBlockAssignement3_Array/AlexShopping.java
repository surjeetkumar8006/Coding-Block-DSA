import java.util.*;

public class AlexShopping {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n and prices
        int n = sc.nextInt();
        HashSet<Integer> prices = new HashSet<>();
        for (int i = 0; i < n; i++) {
            prices.add(sc.nextInt());
        }

        // Input queries
        int q = sc.nextInt();
        while (q-- > 0) {
            int A = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;

            for (int price : prices) {
                if (A % price == 0) {
                    count++;
                    if (count >= k) break;  // early stop to avoid TLE
                }
            }

            if (count >= k) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
