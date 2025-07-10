package Lec4;

public class Continue {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i < n; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

}
