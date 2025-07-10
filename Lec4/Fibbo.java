package Lec4;

import java.util.*;

public class Fibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            int next = second + first;
            first = second;
            second = next;

        }
        System.out.println(first);
        sc.close();
    }
}
