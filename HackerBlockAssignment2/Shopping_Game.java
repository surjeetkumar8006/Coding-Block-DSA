public class Shopping_Game {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int M = sc.nextInt(); // Aayush's max smartphones
            int N = sc.nextInt(); // Harshit's max smartphones

            String winner = getWinner(M, N);
            System.out.println(winner);
        }
    }

    public static String getWinner(int m, int n) {
        int turn = 1; // turn counter

        int aayushSum = 0;
        int harshitSum = 0;

        while (true) {
            if (turn % 2 != 0) { // Aayush's turn (odd)
                aayushSum += turn;
                if (aayushSum > m) {
                    return "Harshit";
                }
            } else { // Harshit's turn (even)
                harshitSum += turn;
                if (harshitSum > n) {
                    return "Aayush";
                }
            }
            turn++;
        }
    }
}
