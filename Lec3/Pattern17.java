public class Pattern17 {
    public static void main(String[] args) {
        int n = 7;
        int star = n / 2;
        int space = 1;
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
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            // Next Line
            System.out.println();
            //Mirror Pattern
            if (row < (n / 2 + 1)) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            row++;
        }
    }
}
