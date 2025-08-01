import java.util.*;

public class Binary_To_Decimal {
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
            int rem = n % 10;
            dec += rem * Math.pow(2, pow);
            pow++;
            n /= 10;
        }
        return dec;

    }
}
