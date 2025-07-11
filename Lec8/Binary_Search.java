import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int item = 9;
        System.out.println(Seach(arr, item));
    }

    public static int Seach(int[] arr, int item) {
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            int mid = (left + right )/ 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > item) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
