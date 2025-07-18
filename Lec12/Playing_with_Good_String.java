import java.util.*;

public class Playing_with_Good_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestSubString(s));
    }

    public static int longestSubString(String s) {
        int ans = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isvowel(ch)) {
                c++;
            } else {
                ans = Math.max(ans, c);
                c = 0;
            }
        }
        ans = Math.max(ans, c);
        return ans;
    }

    public static boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'A' || ch == 'I' || ch == 'O'
                || ch == 'U' || ch == 'E') {
            return true;
        }
        return false;
    }
}
