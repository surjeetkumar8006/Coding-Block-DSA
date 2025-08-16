
public class Palindromic_Substrings {

    public static void main(String[] args) {
        String s = "abc";
        System.out.print(Palindromic(s));
    }

    public static int Palindromic(String s) {
        //odd
        int odd = 0;
        for (int axis = 0; axis < s.length(); axis++) {
            for (int ordit = 0; axis - ordit >= 0 && axis + ordit < s.length(); ordit++) {
                if (s.charAt(axis - ordit) != s.charAt(axis + ordit)) {
                    break;
                }
                odd++;
            }
        }
        int even = 0;
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double ordit = 0.5; axis - ordit >= 0 && axis + ordit < s.length(); ordit++) {
                if (s.charAt((int) (axis - ordit)) != s.charAt((int) (axis + ordit))) {
                    break;
                }
                even++;
            }
        }

        return odd + even;

        //even
    }
}
