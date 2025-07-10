import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
        while (row <= n) {

            // space

            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            int val = 1;
            int i = 1;
            while (i <= star) {
                System.out.print(val + " ");
                if (i <=star / 2) {
                    val++;
                } else {
                    val--;
                }
                i++;

            }
            System.out.println();
            star += 2;
            row++;
            space--;

        }
        sc.close();
    }
}
