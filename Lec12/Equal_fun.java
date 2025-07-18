import java.util.*;

public class Equal_fun {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2="Hello";
        System.out.println(Equal(s1, s2));
    }

    public static boolean Equal(String s1, String s2) {
        if (s1 == s2) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
