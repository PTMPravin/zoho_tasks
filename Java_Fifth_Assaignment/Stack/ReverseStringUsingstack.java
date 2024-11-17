package Stack;

import java.util.Stack;

public class ReverseStringUsingstack {
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
