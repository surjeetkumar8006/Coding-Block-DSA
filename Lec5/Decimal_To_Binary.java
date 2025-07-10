package Lec5;

public class Decimal_To_Binary {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int n = 49;
        while (n > 0) {
            int rem = n % 2;
            sum = sum + rem * mul;
            n = n / 2;
            mul=mul*10;
        }
        System.out.println("Binary Number is:"+sum);
    }
}
