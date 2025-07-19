public class Valid_Palindrome {
    public static void main(String[] args) {
            String s = "A man, a plan, a canal: Panama";
           System.out.println(isPalindrome(s)); // Output: true

    }
     public static boolean isPalindrome(String s) {
         StringBuilder cleaned = new StringBuilder();

        // Step 1 & 2: Filter and convert to lowercase
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Step 3: Check palindrome
        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();

        return cleanedStr.equals(reversedStr);
    }
}
