package inc2010;

import java.util.Scanner;

public class TheBestTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] results = new int[T];
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[][] inputs = new int[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    inputs[j][k] = sc.nextInt();
                }
            }
            results[i] = highestCompability(inputs);
        }
        sc.close();

        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int highestCompability(int[][] inputs) {
        int N = inputs.length;
        int highest = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int multiplication = inputs[i][j] * inputs[i][k] * inputs[j][k];
                    if (multiplication > highest) {
                        highest = multiplication;
                    }
                }
            }
        }
        return highest;
    }
}
