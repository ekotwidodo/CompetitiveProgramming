package inc2010;

import java.util.Scanner;

public class LargestLabeledCommonAncestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short T = sc.nextShort();
        while(T-- > 0){
            short K = sc.nextShort();
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(findLCA(K, A, B));
        }
    }

    private static int findLCA(short K, int A, int B) {
        while(A != B){
            if (A > B) {
                A = getParent(A, K);
            } else {
                B = getParent(B, K);
            }
        }
        return A;
    }

    private static int getParent(int node, short K) {
        if (node == 1) return 1;
        int parent = 1;
        int current = 2;
        while (true) {
            for (int i = 1; i < K; i++) {
                if (current == node) return parent;
                current++;
            }
            parent++;
        }
    }
}
