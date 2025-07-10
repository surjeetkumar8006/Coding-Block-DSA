public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 78, 76, 23, 45 };
        BubbleSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean Sort = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    Sort = true;
                }
            }
            if (Sort == false) {
                break;
            }
        }
    }
}     
