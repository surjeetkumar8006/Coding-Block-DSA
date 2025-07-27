import java.util.*;

public class LongestGoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(findLongestGoodSubstring(s));
    }

    // Check if a character is a vowel
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int findLongestGoodSubstring(String s) {
        int maxLen = 0, current = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                current++;
                maxLen = Math.max(maxLen, current);
            } else {
                current = 0;
            }
        }
        return maxLen;
    }
}
