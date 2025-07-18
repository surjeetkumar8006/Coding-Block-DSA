public class String_Demo2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        
        s1 = s1 + "bye";
        System.out.println(s1);
        System.out.println(s1.length());

    }
}
