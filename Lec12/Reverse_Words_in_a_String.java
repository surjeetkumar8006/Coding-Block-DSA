import java.util.Arrays;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "the sky is blue";
        s.trim();
        String[] arr = s.split(" +");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans+=arr[i]+" ";
        }
        System.out.println(ans.trim());
    }
}