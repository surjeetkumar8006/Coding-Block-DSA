import java.util.*;
public class Replace_Them_All {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong(); // Use long to support large inputs

        String str = String.valueOf(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0') {
                result.append('5');
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
