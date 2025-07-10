public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        int count = CountDigits(n, digit);
        System.out.println(count);

        sc.close();

    }

    public static int CountDigits(int n, int digit) {
       
        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10; // Get the last digit
            if (lastDigit == digit) {
                count++; // Increment count if it matches the digit
            }
            n /= 10; // Remove the last digit
        }
        return count; // Return the total count of the digit
    }
}
