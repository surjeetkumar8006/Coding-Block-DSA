import java.util.*;
public class Decimal_to_bianry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(convertBinaryToDecimal(n));
        sc.close();
    }

    public static int convertBinaryToDecimal(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            dec += rem * Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        return dec;

    }
}
