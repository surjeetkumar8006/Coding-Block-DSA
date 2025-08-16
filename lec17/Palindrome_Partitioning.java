
import java.util.*;

public class Palindrome_Partitioning {

    public static void main(String[] args) {
        String ques = "nitin";
        ArrayList<String> ll = new ArrayList<>();
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        Partition(ques, "", ll, list);
        System.out.println(list);
    }

    public static void Partition(String ques, String ans, ArrayList<String> ll, ArrayList<ArrayList<String>> list) {
        if (ques.length() == 0) {
            list.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (IsPalindrom(s)) {
                ll.add(s);
                Partition(ques.substring(i), ans + s, ll, list);
                ll.remove(ll.size() - 1);
            }

        }
    }

    public static boolean IsPalindrom(String s1) {
        for (int i = 0; i < s1.length() / 2; i++) {
            int n = s1.length() - 1 - i;
            if (s1.charAt(i) != s1.charAt(n)) {
                return false;
            }
        }
        return true;
    }
}
