public class Odd_and_Even_back_in_Delhi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // number of cars

        while (N-- > 0) {
            int carNum = sc.nextInt();
            if (isAllowed(carNum)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    // Function to check whether the car is allowed on Sunday
    public static boolean isAllowed(int carNum) {
        int evenSum = 0;
        int oddSum = 0;

        while (carNum > 0) {
            int digit = carNum % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            carNum /= 10;
        }

        return (evenSum % 4 == 0 || oddSum % 3 == 0);
    }
}
