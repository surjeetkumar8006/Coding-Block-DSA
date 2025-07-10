package Lec4;

import java.util.*;

public class Sum_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; num > 0; i++) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("The Total Sum is:" + sum);
        sc.close();
    }
}
