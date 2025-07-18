import java.util.*;
public class Von_Neuman_Loves_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine()); // Read number of binary inputs

        for (int i = 0; i < N; i++) {
            String binary = sc.nextLine().trim(); // Read binary as string to keep leading zeros
            int decimal = convertBinaryToDecimal(binary);
            System.out.println(decimal);
        }

        sc.close();
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Start from rightmost bit (LSB)
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}
