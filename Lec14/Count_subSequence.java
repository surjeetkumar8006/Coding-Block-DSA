public class Count_subSequence {
    public static void main(String[] args) {
        String ques = "abc";
        System.out.println("\n"+print(ques, ""));
    }

    public static int print(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return 1;
        }
        char ch = ques.charAt(0);
        int x = print(ques.substring(1), ans);
        int y = print(ques.substring(1), ans + ch);
        return x + y;
    }
}
