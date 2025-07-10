package Lec7;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Reverse(int[] arr) {
        int start = 2;
        int end = 6;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
