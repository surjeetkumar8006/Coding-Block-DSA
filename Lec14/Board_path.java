public class Board_path {
    public static void main(String[] args) {
        int n = 4;
        dice(n, 0, "");
    }

    public static void dice(int n, int curr, String ans) {
        if (curr == n) {
            System.out.println(ans);
            return;
        }
        if (curr > n) {
            return;
        }
        for (int d = 1; d <= 3; d++) {
            dice(n, curr + d, ans + d);
        }
        // dice(n, curr + 1, ans + 1);
        // dice(n, curr + 2, ans + 2);
        // dice(n, curr + 3, ans + 3);
    }
}

// dice(4,0,"")
// ├─ dice(4,1,"1")
// │ ├─ dice(4,2,"11")
// │ │ ├─ dice(4,3,"111")
// │ │ │ ├─ dice(4,4,"1111") -> print "1111"
// │ │ │ ├─ dice(4,5,"1112") -> curr>n, return
// │ │ │ ├─ dice(4,6,"1113") -> curr>n, return
// │ │ ├─ dice(4,4,"112") -> print "112"
// │ │ ├─ dice(4,5,"113") -> return
// │ ├─ dice(4,3,"12")
// │ │ ├─ dice(4,4,"121") -> print "121"
// │ │ ├─ dice(4,5,"122") -> return
// │ │ ├─ dice(4,6,"123") -> return
// │ ├─ dice(4,4,"13") -> print "13"
// ├─ dice(4,2,"2")
// │ ├─ dice(4,3,"21")
// │ │ ├─ dice(4,4,"211") -> print "211"
// │ │ ├─ dice(4,5,"212") -> return
// │ │ ├─ dice(4,6,"213") -> return
// │ ├─ dice(4,4,"22") -> print "22"
// │ ├─ dice(4,5,"23") -> return
// ├─ dice(4,3,"3")
// │ ├─ dice(4,4,"31") -> print "31"
// │ ├─ dice(4,5,"32") -> return
// │ ├─ dice(4,6,"33") -> return
