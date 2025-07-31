package inc2010;

import java.util.Scanner;

public class StackMachineSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            StringBuilder stack = new StringBuilder();
            String command = sc.nextLine();

            for  (int i = 0; i < command.length(); i++) {
                char c = command.charAt(i);
                if (c == '+') {
                    if (i + 1 < command.length()) {
                        stack.append(command.charAt(i + 1));
                        i++;
                    }
                } else if (c == '^') {
                    stack.reverse();
                }
            }

            System.out.println(stack.toString());
        }
        sc.close();
    }
}
