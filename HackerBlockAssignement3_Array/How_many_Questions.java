import java.util.*;
public class How_many_Questions {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of problems
        int n = sc.nextInt();

        int solvedCount = 0;

        // Iterate through each problem
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            // Check if at least 2 friends are confident
            if (p + v + t >= 2) {
                solvedCount++;
            }
        }

        // Output the number of problems they will solve
        System.out.println(solvedCount);
    }
}
