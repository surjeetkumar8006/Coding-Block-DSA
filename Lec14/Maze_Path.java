import java.util.*;

public class Maze_Path {
    public static void main(String[] args) {
        int n = 3;// Number or row
        int m = 3; // Number of colum
        ArrayList<String> ll = new ArrayList<>();
        printPath(0, 0, n - 1, m - 1, "", ll);
        System.out.println(ll);
    }

    // cr current row
    // cc current collum
    public static void printPath(int cr, int cc, int er, int ec, String ans, ArrayList<String> ll) {
        if (cc == ec && cr == er) {
            ll.add(ans);
            return;
        }
        if (cc > ec || cr > er) {
            return;
        }

        printPath(cr, cc + 1, er, ec, ans + "H", ll);
        printPath(cr + 1, cc, er, ec, ans + "V", ll);
    }
}
