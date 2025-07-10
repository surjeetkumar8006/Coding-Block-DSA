import java.util.*;
public class LCM {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        // Compute and print LCM
        System.out.println(lcm(N1, N2));
    }

    // Function to calculate GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b; 
    }
}
