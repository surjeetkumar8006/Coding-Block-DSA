public class Print_Dec {
    public static void main(String[] args) {
        int n = 5;
        PC(n);
    }

    public static void PC(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PC(n - 1);
    }
}
