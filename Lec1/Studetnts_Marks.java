import java.util.*;

public class Studetnts_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Studetns Marks");
        int m = sc.nextInt();
        if (m >= 75) {
            System.out.println("A Grade");
        } else if (m >= 65 && m < 75) {
            System.out.println("B Grade");
        } else if (m >= 55 && m < 65) {
            System.out.println("C Grade");
        } else if (m >= 45 && m < 55) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
