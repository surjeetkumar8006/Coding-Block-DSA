public class Lexico_Graphical {
    public static void main(String[] args) {
        String s1 = "kunal";
        String s2 = "komal";
        System.out.println(LexicoGraphical(s1, s2));
        String s3 = "ankit";
        String s4 = "ankita";
        System.out.println(LexicoGraphical(s3, s4));
    }

    public static int LexicoGraphical(String s1, String s2) {
        if (s1 == s2) {
            return 0;
        }
        int min = Math.min(s1.length(), s2.length());
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
}
