public class Is_SortedArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 5, 7, 9 };
        System.out.println(IsSorted(arr, 1));
    }
    
    public static boolean IsSorted(int[] arr, int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return IsSorted(arr, i + 1);

    }
}
