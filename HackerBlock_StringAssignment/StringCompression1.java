import java.util.*;

public class StringCompression1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(compress(s));
    }

    public static String compress(String s) {
        String result = "";
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result += s.charAt(i - 1);
                if (count > 1) {
                    result += count;
                }
                count = 1;
            }
        }
        return result;
    }
}
