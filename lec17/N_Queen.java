
import java.util.*;

public class N_Queen {

    public static void main(String[] args) {

        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<List<String>> ll = new ArrayList<>();

        print(board, 0, n, ll);

        // Print all solutions
        for (List<String> solution : ll) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println(); // separate different boards
        }
    }

    public static void print(boolean[][] board, int row, int tq, List<List<String>> ll) {
        if (tq == 0) {
            ll.add(Display(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                print(board, row + 1, tq - 1, ll);
                board[row][col] = false;
            }
        }
    }

    public static boolean issafe(boolean[][] board, int row, int col) {
        //up

        int r = row;
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }
        //left diagonal
        int c = col;
        r = row;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
        c = col;
        r = row;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static List<String> Display(boolean[][] board) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < board[0].length; j++) {
                sb.append(board[i][j] ? 'Q' : '.');
            }
            result.add(sb.toString());
        }
        return result;
    }
}
