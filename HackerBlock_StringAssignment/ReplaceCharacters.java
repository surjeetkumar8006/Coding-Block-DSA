import java.util.*;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(modifyString(s));
    }

    public static String modifyString(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i % 2 == 0) {
                // Even index → ASCII + 1
                result += (char)(ch + 1);
            } else {
                // Odd index → ASCII - 1
                result += (char)(ch - 1);
            }
        }
        return result;
    }
}
