import java.util.*;

public class Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n - 1;

        while (row <= n) {
            // Print leading spaces
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            // Print stars and hollow part
            int j = 1;
            while (j <= n) {
                // First and last row => print all stars
                // First and last column => print stars
                if (row == 1 || row == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }

            // Move to next line
            System.out.println();
            space--;
            row++;
        }

        sc.close();
    }
}
