public class Is_Char_Persent {
    public static void main(String[] args) {
        String str = "abcdificiini";
        int ind = 3;
        System.out.println(Is_Persent(str, 'i', ind));
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
