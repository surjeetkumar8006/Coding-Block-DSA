import java.util.*;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(countPalindromicSubstrings(s));
    }

    public static int countPalindromicSubstrings(String s) {
        int count = 0;
        int n = s.length();

        // Check for all centers
        for (int center = 0; center < n; center++) {
            // Odd-length palindromes
            count += expandFromCenter(s, center, center);
            // Even-length palindromes
            count += expandFromCenter(s, center, center + 1);
        }
        return count;
    }

    // Expand around a center and count palindromes
    private static int expandFromCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
