package Tasks;

// QUESTION NUM : 6

public class Expression {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 0;

        // ++a - b--
        c = ++a - b--;
        System.out.println(c);

        // a % b++
        c = a % b++;
        System.out.println(c);

        // a*=b+5;
        c = a = a*b+5;
        System.out.println(c);

        // c = 69>>>2
        c = 69 >>> 2;
        System.out.println(c);
    }
}
