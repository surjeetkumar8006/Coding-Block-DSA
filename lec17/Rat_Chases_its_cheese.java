
import java.util.*;

public class Rat_Chases_its_cheese {

    static boolean temp = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) { //n
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        print(maze, 0, 0, ans);
        if (temp == false) {
            System.out.println("NO PATH FOUND");
        }
    }

    public static void print(char[][] maze, int cr, int cc, int[][] ans) {
        if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
            return;
        }
        if (cr == maze.length - 1 && cc == maze[0].length - 1) {
            ans[cr][cc] = 1;
            Display(ans);
            temp = true;
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        int[] r = {-1, 0, 1, 0};
        int[] c = {0, -1, 0, 1};

        for (int i = 0; i < r.length; i++) {
            print(maze, cr + r[i], cc + c[i], ans);
        }
        // print(maze, cr - 1, cc, ans);//up
        // print(maze, cr, cc - 1, ans);//left
        // print(maze, cr + 1, cc, ans);//down
        // print(maze, cr, cc + 1, ans);//right
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }

    public static void Display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
