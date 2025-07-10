package Lec6;

import java.util.*;

public class ArmStrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();

    }

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == originalNumber;
    }
}
