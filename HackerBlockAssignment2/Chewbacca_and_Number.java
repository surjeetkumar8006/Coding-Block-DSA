public class Chewbacca_and_Number {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine(); // Input as string to handle up to 18 digits
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            int digit = ch - '0';
            int inverted = 9 - digit;

            // If first digit and inverted becomes 0, skip inverting
            if (i == 0 && inverted == 0) {
                result.append(digit);
            } else {
                // Choose minimum of digit and inverted
                result.append(Math.min(digit, inverted));
            }
        }

        System.out.println(result);
    }
}
