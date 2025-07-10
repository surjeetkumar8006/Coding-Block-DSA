public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;
        int space = n - 1;
        while (row <= 2 * n - 1) {
            // Space Print
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
            }
            // Star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // Next Line
            System.out.println();
            // Mirror
            if (row < n) {
                star++;
            } else {
                star--;
            }
            row++;
            if (row < n) {
                space--;
            } else {
                space++;
            }
        }
    }
}
