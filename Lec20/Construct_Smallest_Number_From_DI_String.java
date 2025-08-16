
import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

    public static void main(String[] args) {
        String s = "DDD";
        System.out.println(Construct_Smallest(s));
    }

    public static String Construct_Smallest(String str) {
        int[] arr = new int[str.length() + 1];
        int count = 1;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == 'I') {
                arr[i] = count;
                count++;
                while (!st.isEmpty()) {
                    arr[st.pop()] = count;
                    count++;
                }
            } else {
                st.push(i);
            }

        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i];
        }
        return ans;

    }
}
