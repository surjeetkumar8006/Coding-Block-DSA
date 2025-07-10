import  java.util.*;
public class GCD {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        System.out.println(gcd(N1, N2));
    }

    // Function to find GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b < 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
