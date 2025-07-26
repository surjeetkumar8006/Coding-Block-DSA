import java.util.*;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 13;
        Lexicographical(0, n, list);
        System.out.println(list);

    }

    public static void Lexicographical(int curr, int n, ArrayList<Integer> list) {
        if (curr > n) {
            return;
        }
        list.add(curr);
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            Lexicographical(curr * 10 + i, n, list);
        }
    }
}
