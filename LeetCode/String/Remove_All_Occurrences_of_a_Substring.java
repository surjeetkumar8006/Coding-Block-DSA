public class Remove_All_Occurrences_of_a_Substring {

    public static void main(String[] args) {
        
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(s, part));
    }
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}
