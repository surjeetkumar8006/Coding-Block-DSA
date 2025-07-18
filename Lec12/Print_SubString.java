public class Print_SubString {
    public static void main(String[] args) {
        String s = "codingblocks";
        System.out.println(s.substring(2, 7));
        PrintSubString(s);
    }

    public static void PrintSubString(String s) {
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                System.out.println(s.substring(i, j));
            }

        }
    }
}
