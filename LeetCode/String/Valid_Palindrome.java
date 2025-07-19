public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int st = 0;
        int end = s.length() - 1;

        while (st < end) {
            if (!isAlphanumeric(s.charAt(st))) {
                st++;
                continue;
            }
            if (!isAlphanumeric(s.charAt(end))) {
                end--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            st++;
            end--;
        }

        return true;
    }

    // ✅ Your isAlphanumeric method is perfect
    public static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
}
