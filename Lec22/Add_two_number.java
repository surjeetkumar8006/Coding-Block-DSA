
public class Add_two_number {

    public static void main(String[] args) {
        System.out.println(add(12, 34));
        System.out.println(add(12, 34, 34.57));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, double c) {
        return (int) (a + b + c);
    }
}
