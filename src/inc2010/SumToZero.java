package inc2010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SumToZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] A = new int[N];
            int[] B = new int[N];
            int[] C = new int[N];

            StringTokenizer stA = new StringTokenizer(br.readLine());
            StringTokenizer stB = new StringTokenizer(br.readLine());
            StringTokenizer stC = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(stA.nextToken());
            for (int j = 0; j < N; j++) B[j] = Integer.parseInt(stB.nextToken());
            for (int k = 0; k < N; k++) C[k] = Integer.parseInt(stC.nextToken());

            System.out.println(countTriplets1(A, B, C));
        }
        br.close();
    }

    private static long countTriplets1(int[] A, int[] B, int[] C) {
        long counter = 0;
        // Sort two arrays
        Arrays.sort(B);
        Arrays.sort(C);

        for (int a : A) {
            int left = 0;
            int right = B.length - 1;

            while (left < B.length && right >= 0) {
                long sum = (long) a + B[left] + C[right];

                if (sum == 0) {
                    // Count duplicate for B[left]
                    long countLeft = 1;
                    while (left + 1 < B.length && B[left] == B[left + 1]) {
                        countLeft++;
                        left++;
                    }

                    // Count duplicate for C[right]
                    long countRight = 1;
                    while (right - 1 >= 0 && C[right] == C[right - 1]) {
                        countRight++;
                        right--;
                    }

                    counter += countLeft * countRight;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return counter;
    }

    // Solution using HashMap method
    private static long countTriplets2(int[] A, int[] B, int[] C) {
        HashMap<Integer, Integer> mapC = new HashMap<>();
        long counter = 0;

        for (int k : C) {
            mapC.put(k, mapC.getOrDefault(k, 0) + 1);
        }

        for (int i : A) {
            for (int j : B) {
                int target = -(i + j);
                counter += mapC.getOrDefault(target, 0);
            }
        }
        return counter;
    }

    // Solution with Binary Search method
    private static long countTriplets3(int[] A, int[] B, int[] C) {
        long counter = 0;
        Arrays.sort(C);
        for (int i : A) {
            for (int j : B) {
                int target = -(i + j);

                int firstIndex = findFirst(C, target);
                if (firstIndex != -1) {
                    int lastIndex = findLast(C, target);
                    counter += (long) (lastIndex - firstIndex + 1);
                }
            }
        }
        return counter;
    }

    private static int findFirst(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] >= target) {
                if (arr[middle] == target) {
                    return middle;
                }
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    private static int findLast(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] <= target) {
                if (arr[middle] == target) {
                    return middle;
                }
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
