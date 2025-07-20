public class Fact {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fac(n));
    }

    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int f1 = fac(n - 1);
        return f1 * n;
    }
}
