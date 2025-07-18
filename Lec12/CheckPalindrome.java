public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "nitin";
        System.out.println(IsPalindrom(str));
    }

    public static boolean IsPalindrom(String s1) {
        int i = 0;
        int j = s1.length() - 1;
        while (i < j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
