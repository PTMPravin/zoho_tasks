package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StackToArrayConversion {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        stack.push(4.7);
        stack.push(5.5);
        stack.push(6.6);
        stack.push(7.4);

        Double[] array = stack.toArray(new Double[0]);
        System.out.println("Array: " + Arrays.toString(array));

        Stack<Double> newStack = new Stack<>();
        newStack.addAll(Arrays.asList(array));
        System.out.println("New Stack: " + newStack);
    }
}
