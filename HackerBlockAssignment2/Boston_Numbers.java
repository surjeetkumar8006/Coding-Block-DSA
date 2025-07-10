public class Boston_Numbers {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isBoston(n));
    }

    // Function to return 1 if Boston number, else 0
    public static int isBoston(int n) {
        int originalSum = digitSum(n);
        int factorDigitSum = 0;
        int num = n;

        for (int i = 2; i * i <= num; i++) {
            while (n % i == 0) {
                factorDigitSum += digitSum(i);
                n /= i;
            }
        }

        // If there's a prime factor greater than sqrt(num)
        if (n > 1) {
            factorDigitSum += digitSum(n);
        }

        return (factorDigitSum == originalSum) ? 1 : 0;
    }

    // Helper function to calculate digit sum of a number
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
