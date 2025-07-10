import java.util.Scanner;

public class Pattern_Tringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // User input for number of rows

        int row = 1;
        int star = 1;
        int space = n - 1;

        while (row <= n) {
            int i = 1;

            // Print leading spaces
            while (i <= space) {
                System.out.print("  ");  // 2 spaces
                i++;
            }

            // Print numbers
            int j = 1;
            int val = row;
            while (j <= star) {
                System.out.print(val + " ");
                if (j < star / 2 + 1) {
                    val++;
                } else {
                    val--;
                }
                j++;
            }

            System.out.println();
            row++;
            space--;
            star += 2;
        }

        sc.close();
    }
}
