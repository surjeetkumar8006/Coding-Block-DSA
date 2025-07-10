package Lec5;

public class Number_System {
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n = n / 2;
        }
        return binary.toString();
    }
    public static int binaryToDecimal(String binary) {
        int result = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            result += bit * Math.pow(2, power);
            power++;
        }
        return result;
    }
    public static int octalToDecimal(String octal) {
        int result = 0;
        int power = 0;
        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0';
            result += digit * Math.pow(8, power);
            power++;
        }
        return result;
    }
    public static String decimalToHex(int n) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        while (n > 0) {
            int rem = n % 16;
            hex.insert(0, hexChars[rem]);
            n = n / 16;
        }
        return hex.toString();
    }
    public static int hexToDecimal(String hex) {
        int result = 0;
        int power = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int val;
            if (ch >= '0' && ch <= '9') {
                val = ch - '0';
            } else {
                val = 10 + (ch - 'A');
            }
            result += val * Math.pow(16, power);
            power++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Decimal to Binary: " + decimalToBinary(49)); // Output: 1010
        System.out.println("Binary to Decimal: " + binaryToDecimal("1010")); // Output: 10
        System.out.println("Decimal to Octal: " + decimalToOctal(25)); // Output: 31
        System.out.println("Octal to Decimal: " + octalToDecimal("31")); // Output: 25
        System.out.println("Decimal to Hex: " + decimalToHex(255)); // Output: FF
        System.out.println("Hex to Decimal: " + hexToDecimal("FF")); // Output: 255
    }

    public static String decimalToOctal(int n) {
        StringBuilder octal = new StringBuilder();
        while (n > 0) {
            octal.insert(0, n % 8);
            n = n / 8;
        }
        return octal.toString();
    }

}
