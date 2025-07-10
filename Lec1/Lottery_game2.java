import java.util.*;

public class Lottery_game2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n >= 15 && n <= 20) {
            System.out.println("🎁 Prize: Bike");
            if (n >= 15 && n <= 18) {
                System.out.println("➡️ KTM Bike");
            } else {
                System.out.println("➡️ Hero");
            }

        } else if (n >= 50 && n <= 80) {
            System.out.println("🎁 Prize: Cycle");
            if (n >= 50 && n < 70) {
                System.out.println("➡️ Normal Cycle");
            } else {
                System.out.println("➡️ Gear Cycle");
            }

        } else if (n >= 100 && n <= 200) {
            System.out.println("🎁 Prize: Car");
            if (n >= 100 && n < 150) {
                System.out.println("➡️ Creta");
            } else {
                System.out.println("➡️ THAR");
            }

        } else if (n >= 250 && n <= 300) {
            System.out.println("🎁 Prize: Mac");
            if (n > 250 && n <= 281) {
                System.out.println("➡️ M1 Mac");
            } else {
                System.out.println("➡️ M4 Mac");
            }

        } else if (n >= 1200 && n <= 1400) {
            System.out.println("🎁 Prize: Kurkure");
            if (n >= 1200 && n <= 1300) {
                System.out.println("➡️ Rice Kurkure");
            } else {
                System.out.println("➡️ Normal Kurkure");
            }

        } else {
            System.out.println("😔 Sorry Dear, Your Bad Luck!");
        }

        sc.close();
    }
}
