public class Pattern3 {
    public static void main(String[] args) {
        int star = 4;
        int space = 0;
        int row = 1;
        int n = 5;
        while (row <= n) {
            // Space Print
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // Star Print
            int j = 1;
            while (j <= star) {
                System.out.print("*  ");
                j++;
            }
            // New Line Prep;
            System.out.println();
            row++;
            space++;

        }
    }
}