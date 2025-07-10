import java.util.*;
public class Conversion_Any_To_Any {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sb = sc.nextInt(); // source base
        int db = sc.nextInt(); // destination base
        int sn = sc.nextInt(); // number in source base

        int decimal = anyBaseToDecimal(sn, sb);       // Step 1: Convert to decimal
        int result = decimalToAnyBase(decimal, db);   // Step 2: Convert to destination base

        System.out.println(result);
    }

    // Convert any base to decimal (base 10)
    public static int anyBaseToDecimal(int num, int base) {
        int decimal = 0;
        int power = 1;

        while (num > 0) {
            int digit = num % 10;
            decimal += digit * power;
            power *= base;
            num /= 10;
        }

        return decimal;
    }

    // Convert decimal (base 10) to any base
    public static int decimalToAnyBase(int num, int base) {
        int result = 0;
        int power = 1;

        while (num > 0) {
            int digit = num % base;
            result += digit * power;
            power *= 10;
            num /= base;
        }

        return result;
    }
}
