package Tasks;

// QUESTION NUM : 2

public class BitWiseOperators {
    public static void main(String[] args) {
        int n = 4; // 100 
        int num = 7; // 111

        //BitWise And Operator
        int and = n & num;
        System.out.println("n & num : "+and);

        //BitWise Or Operator
        int or = n | num;
        System.out.println("n | num : "+or);

        //BitWise XOR Operator
        int xor = n ^ num;
        System.out.println("n ^ num : "+xor);

        //BitWise Not Operator
        int not = ~num;
        System.out.println("~num : "+not);

        //BitWise Left Shift Operator
        int leftShift = Integer.MAX_VALUE << 1;
        System.out.println("num << 1 : "+leftShift);

        //BitWise Right Shift Operator
        int rightShift = n >> 1;
        System.out.println("n >> 1 : "+rightShift);

        
        //BitWise Unsigned Right Shift Operator
        int unsignedRightShift = -10 >>> 1;
        System.out.println("n >>> 1 : "+unsignedRightShift);
    }
}
