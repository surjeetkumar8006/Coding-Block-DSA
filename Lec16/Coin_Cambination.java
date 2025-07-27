import java.util.*;

public class Coin_Cambination {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] coin = { 2, 3, 6, 7 };
        int amount = 7;
        Permutation(coin, amount, "", 0);

    }

    public static void Permutation(int[] coin, int amount, String ans, int inx) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = inx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                Permutation(coin, amount - coin[i], ans + coin[i], i);
            }
        }
    }
}
