package Stack;

import java.util.Stack;

public class PeekAndSearchStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");

        System.out.println("Top element: " + stack.peek());

        int position = stack.search("second");
        System.out.println("Position of 'second': " + position);
    }
}
