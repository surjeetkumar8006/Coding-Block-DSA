import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = { 1, 78, 79, 101, 189 };
        int key = 78;
        Arrays.sort(arr);
        System.out.println(BinarySearch(arr, key));
    }
    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
