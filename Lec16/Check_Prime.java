public class Check_Prime {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(IsPrime(n));
    }

    public static boolean IsPrime(int n) {
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
