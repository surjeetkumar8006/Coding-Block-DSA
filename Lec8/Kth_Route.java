public class Kth_Route {
    public static void main(String[] args) {
        int n = 143;
        int k = 3;
        System.out.println(Kthroot(n, k));
    }

    public static int Kthroot(int n, int k) {
        int left = 0;
        int right = n;
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;

    }

}
