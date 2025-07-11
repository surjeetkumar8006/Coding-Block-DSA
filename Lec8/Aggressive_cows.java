import java.lang.reflect.Array;
import java.util.*;

public class Aggressive_cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt();
        int noc = sc.nextInt();
        int[] stall = new int[nos];
        for (int i = 0; i < stall.length; i++) {
            stall[i] = sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(largest_minimum(stall, noc));
    }

    public static int largest_minimum(int[] stall, int noc) {
        int n = stall.length;
        int left = 1;
        int ans = 0;
        int right = stall[n - 1] - stall[0];
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isItPossible(stall, noc, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int[] stall, int noc, int mid) {

        int pos=stall[0];
        int cow=1;
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
            if(cow==noc){
                return  true;
            }
        }

        return false;
    }
}
