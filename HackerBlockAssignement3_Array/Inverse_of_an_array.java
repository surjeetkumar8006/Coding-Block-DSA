import java.util.*;

public class Inverse_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] inverted = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            inverted[arr[i]]=i;
        }
        for(int i=0;i<n;i++){
            System.out.print(inverted[i]+" ");
        }
    }

}
