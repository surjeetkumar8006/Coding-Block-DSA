public class Coin_Toss {
    public static void main(String[] args) {
        int n = 3;
        print(n, "");
    }

    public static void print(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        print(n - 1, ans + "H");
        print(n - 1, ans + "T");
    }
}



















//Level 0: print(3, "")
        // /          \
// Level 1: print(2, "H")    print(2, "T")
//         /        \         /         \
// Level 2: print(1,"HH") print(1,"HT") print(1,"TH") print(1,"TT")
//        /    \         /     \         /     \       /     \
// Level 3: print(0,"HHH") print(0,"HHT") print(0,"HTH") print(0,"HTT") print(0,"THH") print(0,"THT") print(0,"TTH") print(0,"TTT")


    //                      ("", 3)
    //                    /         \
    //               ("H", 2)      ("T", 2)
    //              /      \       /      \
    //        ("HH", 1) ("HT", 1) ("TH", 1) ("TT", 1)
    //        /    \      /   \     /   \     /   \
    //  ("HHH",0)("HHT",0)("HTH",0)("HTT",0)("THH",0)("THT",0)("TTH",0)("TTT",0)
