import java.util.*;
public class Print_reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revsNum = 0;
        while(num>0){
            int rem = num % 10;
            revsNum = revsNum*10 +rem;
            num = num / 10;
        }
        System.out.println(revsNum);
        sc.close();
    }
}
