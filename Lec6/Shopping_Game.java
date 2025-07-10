package Lec6;

import java.util.*;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            Shopping(m, n);
            t--;
        }
        sc.close();   
    }
    public static void Shopping(int m, int n) {
        int a = 0;
        int h = 0;
        int phone = 1;
        while (true) {
            a = a + phone;
            if (a > m) {
                System.out.println("Harshit");
                return;
            }
            phone++;
            h = h + phone;
            if (h > a) {
                System.out.println("Aayush");
                return;
            }
            phone++;
        }
    }
}
