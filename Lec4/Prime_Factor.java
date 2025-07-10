package Lec4;

import java.util.*;

public class Prime_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.print(i + ",");
                n = n / i;
            } else {
                i++;
            }
        }
        sc.close();
    }
}
