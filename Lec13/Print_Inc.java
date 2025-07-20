public class Print_Inc {
    public static void main(String[] args) {
        int n = 5;
        PC(n);
    }

    public static void PC(int n) {
        if (n == 0) {
            return;
        }
        PC(n - 1);
        System.out.println(n);
    }
}
