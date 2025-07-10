public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = 2 * n - 3;
        int row = 1;
        while (row <= n) {

            // Star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            i = 1;
            // Space Print
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // Star Print
            int j = 1;
            if (row == n) {
                j = 2;
            }
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            // Next Line
            System.out.println();
            row++;
            space -= 2;
            star++;
        }
    }
}
