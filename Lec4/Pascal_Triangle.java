package Lec4;

import java.util.*;

public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 0;

        while (row < n) {
            // Star Print
            int i = 0;
            int ncr = 1;
            while (i < star) {
                System.out.print(ncr + " ");
                ncr = (ncr * (row - i)) / (i + 1);
                i++;
            }
            System.out.println();

            row++;
            star++;
        }
        sc.close();
    }

}
