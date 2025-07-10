package Lec6;

import java.util.Scanner;

public class Sum_Of_Odd_place {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = SumOfOddPlace(n);
        System.out.println(sum);
        sc.close();
    }

    public static int SumOfOddPlace(int n) {
        // Sample Input
        // 2635
        // Sample Output
        // 11
        // 5
        int sum = 0;
        int place = 1; // Start with the first place (rightmost digit)
        while (n > 0) {
            int digit = n % 10; // Get the rightmost digit
            if (place % 2 != 0) { // Check if the place is odd
                sum += digit; // Add to sum if it's an odd place
            }
            n /= 10; // Remove the rightmost digit
            place++; // Move to the next place
        }
        return sum; // Return the total sum of digits at odd places
    }
}
