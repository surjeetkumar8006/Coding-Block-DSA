import java.util.*;

public class Mirror_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Only odd numbers allowed

        int row = 1;
        int star = 1;
        int space = n / 2;

        while (row <= n) {
            int i = 1;
            // Print leading tabs
            while (i <= space) {
                System.out.print("\t");
                i++;
            }

            // Print stars with tabs
            int j = 1;
            while (j <= star) {
                System.out.print("*\t");
                j++;
            }

            System.out.println();

            // Update for next row
            if (row <= n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }

            row++;
        }

        sc.close();
    }
}
