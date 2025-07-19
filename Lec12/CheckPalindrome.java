public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "niti";
        System.out.println(IsPalindrom(str));
    }

    public static boolean IsPalindrom(String s1) {
      for(int  i=0;i<s1.length()/2;i++){
        int  n=s1.length()-1-i;
        if(s1.charAt(i)!=s1.charAt(n)) {
            return false;
        }
      }
        return true;
    }
}
