public class Pattern22 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int space = -1;
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
            if (row == 1) {
                j = 2;
            }
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            // Next Line
            System.out.println();
            row++;
            space += 2;
            star--;
        }
    }
}
