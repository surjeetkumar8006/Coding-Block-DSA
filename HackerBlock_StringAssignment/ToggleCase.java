import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(toggleCase(s));
    }

    public static String toggleCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if lowercase
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 'a' + 'A'); // convert to uppercase
            } 
            // Check if uppercase
            else if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch - 'A' + 'a'); // convert to lowercase
            } 
            else {
                result += ch; // if not alphabet, leave unchanged
            }
        }
        return result;
    }
}
