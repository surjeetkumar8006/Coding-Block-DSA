package Lec6;

import java.util.Scanner;

public class Inverse_0f_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inverse = Inverse(n);
        System.out.println(inverse);
        sc.close();
    }

    public static int Inverse(int n) {

        int inverse = 0;
        int place = 1;
        while (n > 0) {
            int digit = n % 10;
            inverse += place * (int) Math.pow(10, digit - 1);
            n /= 10;
            place++;
        }
        return inverse;
    }
}
