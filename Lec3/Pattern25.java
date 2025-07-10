public class Pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n - 1;
        int row = 1;
        int count=1;
        while (row <= n) {
            int i = 1;
            // Space Print
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            // Star Print
            int j = 1;

            while (j <= star) {
                System.out.print(count + "\t");
                j++;
                count++;
            }
            // Next Line
            System.out.println();
            row++;
            space--;
            star += 2;

        }

    }
}
