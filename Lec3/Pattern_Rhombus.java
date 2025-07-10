import java.util.*;

public class Pattern_Rhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n - 1;
        int row = 1;
        int val = 1;

        while (row <= 2 * n - 1) {
            int i = 1;
            // Space Print
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            // Star Print
            int j = 1;
            int s = val;
            while (j <= star) {
                System.out.print(s + "\t");
                if (j <= star / 2) {
                    s++;
                } else {
                    s--;
                }
                j++;
            }
            // Next Line
            System.out.println();
            if (row < n) {
                star += 2;
                space--;
                val++;
            } else {
                star -= 2;
                space++;
                val--;
            }
            row++;
        }
        sc.close();

    }
}
