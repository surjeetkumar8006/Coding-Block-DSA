import java.util.*;

public class Piyush_and_Magical_Park {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // Rows
        int M = sc.nextInt();  // Columns
        int K = sc.nextInt();  // Minimum strength needed
        int S = sc.nextInt();  // Initial strength

        char[][] park = new char[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                park[i][j] = sc.next().charAt(0);
            }
        }

        boolean success = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                char ch = park[i][j];

                if (S < K) {
                    success = false;
                    break;
                }

                if (ch == '.') {
                    S -= 2;
                } else if (ch == '*') {
                    S += 5;
                } else if (ch == '#') {
                    break;  // move to next row
                }

                if (j != M - 1) {
                    S--;  // 1 strength for moving right, unless at end of row
                }
            }
        }

        if (S >= K && success) {
            System.out.println("Yes");
            System.out.println(S);
        } else {
            System.out.println("No");
        }
    }
}
