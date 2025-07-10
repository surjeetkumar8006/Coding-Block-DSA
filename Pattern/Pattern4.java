
public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n - 1;
        int row = 1;

        while (row <= n) {

            // Start

            int k = 1;
            while (k <= star) {
                System.out.print("* ");
                k++;
            }

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
            //Mirror Pattern
            if (row <n) {
                space = -2;
                star++;
            } else {
                space = +2;
                star--;
            }

        }
    }

}