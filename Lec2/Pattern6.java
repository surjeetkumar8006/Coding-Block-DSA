public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int space = 0;
        int row = 1;
        while (row <= n) {
            int i = 1;
            // Space Print
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // Star Print
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            // Next Line
            System.out.println();
            row++;
            space = space+2;
            star--;

        }

    }
}
