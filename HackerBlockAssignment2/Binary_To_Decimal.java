import java.util.*;
public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(convertBinaryToDecimal(n));
        sc.close();
    }

    public static int convertBinaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        return decimal;
    }
}
