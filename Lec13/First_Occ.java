public class First_Occ {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 5, 7, 4, 5, 7 };
        int item = 5;
        System.out.println(FindIndex(arr, item, 0));
    }

    public static int FindIndex(int[] arr, int item, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == item) {
            return i;
        }
        return FindIndex(arr, item, i + 1);

    }
}
