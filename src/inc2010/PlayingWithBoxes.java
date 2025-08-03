package inc2010;

import java.util.Scanner;

public class PlayingWithBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long MOD = 1000000007;

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N == 2) {
                System.out.println(1);
                continue;
            }

            long result = 1;
            for (long i = 3; i <= N; i++) {
                long combination;
                if (i % 2 == 0) {
                    combination = (i / 2) * (i - 1);
                } else {
                    combination = i * ((i - 1) / 2);
                }

                combination %= MOD;
                result = (result * combination) % MOD;
            }
            System.out.println(result);
        }
    }

    // Solution using recursive method
    private static int recursiveSolution(int boxes) {
        if (boxes == 1) {
            return 0;
        } else if (boxes == 2) {
            return 1;
        } else {
            return recursiveSolution(boxes - 1) * (boxes * (boxes - 1)/2);
        }
    }
}
