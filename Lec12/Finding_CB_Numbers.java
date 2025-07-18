import java.util.*;

public class Finding_CB_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        PrintSubString(s);

    }

    public static void PrintSubString(String s) {
        int c = 0;
        boolean[] vsited = new boolean[s.length()];
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                String str = s.substring(i, j);// iska matalab i to j-1 k charecter
                long num = Long.parseLong(str);
                if (isCB_Number(num) && isvisited(vsited, i, j)) {
                    c++;// CB number count
                    // i to j-1 tk char use nhi karna hai
                    for (int k = i; k < j; k++) {
                        vsited[k] = true;
                    }

                }
            }

        }
        System.out.println(c);
    }

    public static boolean isvisited(boolean[] vsited, int i, int j) {
        for (; i < j; i++) {
            if (vsited[i] == true) {
                return false;
            }
        }
        return true;

    }

    public static boolean isCB_Number(long num) {
        if (num == 0 || num == 1) {
            return false;
        }
        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0) {
                return false;
            }
        }
        return true;
    }

}
