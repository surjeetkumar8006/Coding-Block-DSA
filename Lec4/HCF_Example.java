package Lec4;
public class HCF_Example {
    public static void main(String[] args) {
        int diviser = 36;
        int divident = 60;
        while (divident % diviser != 0) {
            int rem = divident % diviser;
            divident = diviser;
            diviser = rem;
        }
        System.out.println(diviser);
    }
}