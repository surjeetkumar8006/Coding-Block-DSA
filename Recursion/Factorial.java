
public class Factorial {
    public static void main(String[] args) {
        int num = 5; // You can change this number
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }
}
