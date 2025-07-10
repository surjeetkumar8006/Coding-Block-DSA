package Lec7;

import java.util.Scanner;

public class Array_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        OutputArray(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();

    }

    public static void OutputArray(int[] arr) {
        arr[4] = 23;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}