import java.util.*;
public class Sumofoddandevenplaced {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();  // Since N can be up to 10^9, use long

        int oddSum = 0;
        int evenSum = 0;
        int position = 1;

        while (N > 0) {
            int digit = (int)(N % 10);  // Get last digit

            if (position % 2 == 1) {
                oddSum += digit;
            } else {
                evenSum += digit;
            }

            N = N / 10;
            position++;
        }

        // Output
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
