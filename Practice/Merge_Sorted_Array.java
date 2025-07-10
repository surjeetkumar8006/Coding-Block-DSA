public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] num1 = new int[6];
        int[] num2 = new int[3];
        int m = 3;
        int n = 3;
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 0;
        num1[4] = 0;
        
        num1[5] = 0;

        num2[0] = 2;
        num2[1] = 5;
        num2[2] = 6;
        Merge_Sorted_Array(num1, num2, m, n);
        for (int i = 0; i < 6; i++) {
            System.out.print(num1[i] + " ");
        }

    }

    public static void Merge_Sorted_Array(int[] num1, int[] num2, int m, int n) {
        int i = n - 1;
        int j = m - 1;
        int x = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[x] = num1[i];
                x--;
                i--;
            } else {
                num1[x] = num2[j];
                x--;
                j--;

            }
        }
        while (j >= 0) {
            num1[x] = num2[i];
            x--;
            j--;
        }
    }

}
