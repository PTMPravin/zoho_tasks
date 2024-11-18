package Stack;

import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Remaining stack: " + stack);
    }
}