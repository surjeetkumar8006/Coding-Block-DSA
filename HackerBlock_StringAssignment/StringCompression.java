import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(compress(s));
    }

    public static String compress(String s) {
        String result = "";
        int count = 1; // at least 1 occurrence of the current character

        for (int i = 1; i <= s.length(); i++) {
            // Check if current character is same as previous
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                // Append character + its count
                result += s.charAt(i - 1) + String.valueOf(count);
                count = 1; // reset for the next character
            }
        }
        return result;
    }
}
