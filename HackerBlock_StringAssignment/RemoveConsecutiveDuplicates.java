import java.util.*;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        String result = "" + s.charAt(0); // start with first character

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result += s.charAt(i);
            }
        }

        return result;
    }
}
