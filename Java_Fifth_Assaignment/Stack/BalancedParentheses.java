package Stack;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String input1 = "(())";
        String input2 = "(()";

        System.out.println("Input: " + input1 + " - Balanced: " + isBalanced(input1));
        System.out.println("Input: " + input2 + " - Balanced: " + isBalanced(input2));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.add(ch);
            }else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
