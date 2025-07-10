public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n - 1;
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
                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            // Next Line
            System.out.println();
            row++;
            space--;
            star += 2;

        }

    }
}
