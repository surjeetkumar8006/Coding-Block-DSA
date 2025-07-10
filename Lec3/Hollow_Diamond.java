import java.util.*;

public class Hollow_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 5
        int row = 1;
        int stars = n / 2 + 1; // starts with 3 stars
        int spaces = -1;

        while (row <= n) {
            int i = 1;

            i = 1;
            while (i <= stars) {
                System.out.print("* ");
                i++;
            }

            //  spaces Print
            i = 1;
            while (i <= spaces) {
                System.out.print("  ");
                i++;
            }

            //  starsPrint
            i = 1;
            if (row == 1 || row == n) {
                i = 2;
            }

            while (i <= stars) {
                System.out.print("* ");
                i++;
            }

            // Move to next line
            System.out.println();

            // Mirror Pattern
            if (row < n / 2 + 1) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }

            row++;
        }

        sc.close();
    }
}
