public class Conversion_Fahrenheit_to_Celsius {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int minF = sc.nextInt();
        int maxF = sc.nextInt();
        int step = sc.nextInt();

        for (int f = minF; f <= maxF; f += step) {
            int c = (int)((5.0 / 9) * (f - 32)); // Celsius conversion, rounded down
            System.out.println(f + "\t" + c);
        }
    }
}
