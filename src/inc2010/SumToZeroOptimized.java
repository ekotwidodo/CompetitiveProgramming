import java.util.*;

public class SumToZeroOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int[] C = new int[N];

            for (int i = 0; i < N; i++) A[i] = sc.nextInt();
            for (int i = 0; i < N; i++) B[i] = sc.nextInt();
            for (int i = 0; i < N; i++) C[i] = sc.nextInt();

            Arrays.sort(C);

            long count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int target = -(A[i] + B[j]);
                    count += countOccurrences(C, target);
                }
            }

            System.out.println(count);
        }
        sc.close();
    }

    private static int countOccurrences(int[] C, int target) {
        int left = lowerBound(C, target);
        int right = upperBound(C, target);
        return right - left;
    }

    private static int lowerBound(int[] arr, int key) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < key) l = m + 1;
            else r = m;
        }
        return l;
    }

    private static int upperBound(int[] arr, int key) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] <= key) l = m + 1;
            else r = m;
        }
        return l;
    }
}