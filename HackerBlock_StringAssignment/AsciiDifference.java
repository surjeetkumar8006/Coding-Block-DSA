import java.util.*;

public class AsciiDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(insertAsciiDifference(s));
    }

    public static String insertAsciiDifference(String s) {
        String result = "" + s.charAt(0);  // Start with the first character
        for (int i = 0; i < s.length() - 1; i++) {
            int diff = s.charAt(i + 1) - s.charAt(i);
            result += diff + "" + s.charAt(i + 1);
        }
        return result;
    }
}
