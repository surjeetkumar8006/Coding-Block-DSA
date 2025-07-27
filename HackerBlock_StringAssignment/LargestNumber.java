import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }

            Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

            // If the highest number is "0", all numbers are zero
            if (arr[0].equals("0")) {
                System.out.println("0");
            } else {
                StringBuilder result = new StringBuilder();
                for (String num : arr) result.append(num);
                System.out.println(result);
            }
        }

        sc.close();
    }
}
