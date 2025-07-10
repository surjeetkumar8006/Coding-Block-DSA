package Lec7;

public class Reverse_Print {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
