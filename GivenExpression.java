package Tasks;

// QUESTION NUM : 7

public class GivenExpression {
    public static void main(String[] args) {
        int b = 28;

        /*
         * post increment(b++) -> 'b' first returns 28 and then incremented to 29 (currently, b = 29)
         * pre increment(++b) -> 'b' first increment to 30 and then returns 30 (currently, b=30)
         * pre decrement(--b) -> 'b' first decremented to 29 and then returns 29 (currently, b = 29)
         * post decrement(b--) -> 'b' first returns 29 and then decremented to 28 (currently, b=28)
         * hence,b = 28 + (28 + 30 + 29 + 29) = 144
         */

        b+=b++ + ++b + --b + b--;

        System.out.println(b);
    }
}
