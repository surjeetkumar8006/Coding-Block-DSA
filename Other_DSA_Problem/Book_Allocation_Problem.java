import java.util.*;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // number of books
            int m = sc.nextInt(); // number of students
            int[] pages = new int[n];
            for (int i = 0; i < n; i++) {
                pages[i] = sc.nextInt();
            }
            System.out.println(MinPage(pages,m));
        }
        
    }

    public static int MinPage(int[] page, int nos) {
        int lo = 0;
        int high = 0;
        for (int i = 0; i < page.length; i++) {
            high += page[i];
            lo = Math.max(lo, page[i]); // because one book can't be split
        }

        int ans = -1;
        while (lo <= high) {
            int mid = (lo + high) / 2;
            if (itispossible(page, nos, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean itispossible(int[] page, int nos, int mid) {
        int student = 1;
        int readPage = 0;

        for (int i = 0; i < page.length; i++) {
            if (page[i] > mid) {
                return false;
            }

            if (readPage + page[i] <= mid) {
                readPage += page[i];
            } else {
                student++;
                readPage = page[i];

                if (student > nos) {
                    return false;
                }
            }
        }
        return true;
    }
}
