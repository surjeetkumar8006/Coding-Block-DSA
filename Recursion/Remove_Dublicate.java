public class Remove_Dublicate {
    public static void main(String[] args) {
        String str = "surjeetkumar";
        Remove_Dublicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void Remove_Dublicates(String str, int inx, StringBuilder newStr, boolean map[]) {
        if (inx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(inx);
        System.out.print(ch - 'a' + " ");
        if (map[ch - 'a'] == true) {
            Remove_Dublicates(str, inx + 1, newStr, map);
        } else {
            map[ch - 'a'] = true;
            Remove_Dublicates(str, inx + 1, newStr.append(ch), map);
        }
    }
}
