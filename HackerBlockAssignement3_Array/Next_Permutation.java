import java.util.*;

public class MNext_Permutationain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        nextPermutation(arr);

        // Use StringBuilder for fast output
        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            sb.append(val).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;

        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i])
                j--;
            swap(arr, i, j);
        }

        reverse(arr, i + 1, n - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }
}
