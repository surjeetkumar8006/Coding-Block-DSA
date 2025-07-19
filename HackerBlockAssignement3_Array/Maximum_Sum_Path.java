public class Maximum_Sum_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
            for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

            System.out.println(getMaxPathSum(arr1, arr2));
        }
    }

    public static int getMaxPathSum(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, result = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                // Common element
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < arr1.length) sum1 += arr1[i++];
        while (j < arr2.length) sum2 += arr2[j++];

        result += Math.max(sum1, sum2);
        return result;
    }
}
