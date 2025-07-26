import java.util.*;

public class Key_Paid {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String ques="237";
        Letter_Combination(ques, "", list);
        System.out.println(list);

    }

    public static void Letter_Combination(String ques, String ans, ArrayList<String> list) {// 237
        if (ques.length() == 0) {
            list.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String press = key[ch - 48];
        for (int i = 0; i < press.length(); i++) {
            Letter_Combination(ques.substring(1), ans + press.charAt(i), list);
        }

    }
}
