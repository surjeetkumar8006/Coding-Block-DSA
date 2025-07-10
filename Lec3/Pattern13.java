public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;
        while (row <= 2 * n - 1) {
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
        }
    }
}
