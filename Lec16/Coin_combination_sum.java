import java.util.*;

public class Coin_combination_sum {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ll = new ArrayList<>();
        int[] coin = { 2, 3, 6, 7 };
        int amount = 7;
        Permutation(coin, amount, ll, result, 0);
        System.out.println(result);

    }

    public static void Permutation(int[] coin, int amount, ArrayList<Integer> ll, List<List<Integer>> result, int inx) {
        if (amount == 0) {
            result.add(new ArrayList<>(ll));
            return;
        }
        for (int i = inx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ll.add(coin[i]);
                Permutation(coin, amount - coin[i], ll, result, i);
                ll.remove(ll.size() - 1);
            }
        }
    }
}
