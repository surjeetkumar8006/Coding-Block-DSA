import java.util.*;

public class Lottery_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = sc.nextInt();

        if (n >= 15 && n <= 20) {
            System.out.println("Bike");

        } else if (n >= 50 && n <= 80) {
            System.out.println("Cycle");

        } else if (n >= 250 && n <= 300) {
            System.out.println("mac");

        } else if (n >= 1200 && n <= 1400) {
            System.out.println("Kurkure");

        } else {
            System.out.println("Sorry Dear, Your Bad Luck!");
        }

        sc.close();
    }
}
