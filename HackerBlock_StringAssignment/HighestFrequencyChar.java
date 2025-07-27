import java.util.*;

public class HighestFrequencyChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(getMaxFrequencyChar(s));
    }

    public static char getMaxFrequencyChar(String s) {
        int[] freq = new int[256]; // ASCII character frequency

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Find character with max frequency
        int maxFreq = 0;
        char result = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > maxFreq) {
                maxFreq = freq[s.charAt(i)];
                result = s.charAt(i);
            }
        }

        return result;
    }
}
