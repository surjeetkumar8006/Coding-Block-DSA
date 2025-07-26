public class Tiling_Problem {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingPoblem(n));
    }

    public static int tilingPoblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int vertical = tilingPoblem(n - 1);
        int horizontal = tilingPoblem(n - 2);
        int total = vertical + horizontal;
        return total;
    }
}
