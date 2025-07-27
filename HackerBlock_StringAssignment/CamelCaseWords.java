import java.util.*;

public class CamelCaseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Agar uppercase character mila aur word empty nahi hai
            if (Character.isUpperCase(c) && word.length() > 0) {
                System.out.println(word);
                word = ""; // reset word
            }

            word += c; // character ko current word me add karo
        }

        // Last word print karo
        if (!word.isEmpty()) {
            System.out.println(word);
        }
    }
}
