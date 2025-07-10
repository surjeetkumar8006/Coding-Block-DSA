import java.util.*;

public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number of rows
        int n = sc.nextInt();
        int star = 1;
        int space = 2 * n - 3;
        int row = 1;

        while (row <= n) {

            // 1. Print left stars
            int i = 1;
            int val = 1;
            while (i <= star) {
                System.out.print(val + " ");
                if (row <=n) {
                    val++;
                } else {
                    val--;
                }
                i++;
            }

            // 2. Print middle spaces
            i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // 3. Print right stars
            int j = 1;
            // In last row, skip printing the middle star twice
           
            while (j <= star) {
                System.out.print(val + " ");
                if (row >=n) {
                    val--;
                } else {
                    val--;
                }
                j++;

            }

            // 4. Move to next line
            System.out.println();

            // 5. Update counters
            row++;
            star++;
            space -= 2;
        }

        sc.close();
    }
}
