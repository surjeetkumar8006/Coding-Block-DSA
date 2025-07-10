import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
