public class Friend_Pairs {
    public static void main(String[] args) {
        System.out.println(Friend_Pair(3));
    }

    public static int Friend_Pair(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fnd1 = Friend_Pair(n - 1);
        int fnd2 = Friend_Pair(n - 2);
        int pairsWay = (n - 1) * fnd2;
        int totalWays = fnd1 + pairsWay;
        return totalWays;
    }
}
