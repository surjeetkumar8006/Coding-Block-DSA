import java.util.*;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int n = sc.nextInt(); // number of rickshaws
            int m = sc.nextInt(); // number of cabs

            int[] rickshaw = new int[n];
            int[] cab = new int[m];

            for (int i = 0; i < n; i++) {
                rickshaw[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                cab[i] = sc.nextInt();
            }

            // Calculate total cost for rickshaws
            int totalRickshaw = 0;
            for (int i = 0; i < n; i++) {
                totalRickshaw += Math.min(rickshaw[i] * c1, c2);
            }
            totalRickshaw = Math.min(totalRickshaw, c3);

            // Calculate total cost for cabs
            int totalCab = 0;
            for (int i = 0; i < m; i++) {
                totalCab += Math.min(cab[i] * c1, c2);
            }
            totalCab = Math.min(totalCab, c3);

            // Final answer
            int total = Math.min(totalRickshaw + totalCab, c4);

            System.out.println(total);
        }
    }
}
