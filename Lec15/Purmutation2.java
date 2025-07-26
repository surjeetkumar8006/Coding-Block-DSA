public class Purmutation2 {
    public static void main(String[] args) {
        String str = "abca";
        print(str, "");
    }

    public static void print(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if (!Is_Persent(ques, ch, i + 1)) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                print(s1 + s2, ans + ch);
            }
        }
    }

    public static boolean Is_Persent(String str, char ch, int inx) {
        for (int i = inx; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
