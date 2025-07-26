public class PrintBinaryString {
    public static void main(String[] args) {
        PrintBinaryStrin(3, 0, "");
    }

    public static void PrintBinaryStrin(int n, int lastPlace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        PrintBinaryStrin(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            PrintBinaryStrin(n - 1, 1, str + "1");
        }
    }
}
