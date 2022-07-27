import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        // test string goes here
        String eq = "{[()}]";

        if (bracBal(eq))
            System.out.println("Expression is balanced ");

        else
            System.out.println("Expression is not balanced ");
    }

    static boolean bracBal(String eq) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < eq.length(); i++) {
            char x = eq.charAt(i);

            if (x == '{' || x == '(' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
    }
}
