import java.util.*;

public class Pattern_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        int val=1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print(val+" ");
                i++;
                val++;
            }
            System.out.println();
            row++;
            star++;
           
        }
        sc.close();

    }
}
