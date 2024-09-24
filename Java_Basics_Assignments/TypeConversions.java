package Assaignmet;

public class TypeConversions {
    public static void main(String[] args) {
        byte b = 2;
        char ch = 'b';
        short st = 2; 
        int n = 2;
        long l = 2;
        float fl = 2.2f;
        double d = 2.2;

        // Widening Type Casting  ->  Smaller To Larger -> We Can Convert Implicitly And Explicitly

        // Explictly
        
        double intToDoubleE = (double)n;
        
        // Implicitly

        int byteToInt = b;
        int charToInt = ch;
        int shortToInt = st;
        double intToDouble = n;
        long intToLong = n;
        float intToFloat = n;
        double floatToDouble = fl;

        System.out.println(byteToInt);
        System.out.println(charToInt);
        System.out.println(shortToInt);
        System.out.println(intToDouble);
        System.out.println(intToLong);
        System.out.println(intToFloat);
        System.out.println(floatToDouble);
        System.out.println(intToDoubleE);

        // Narrowing Type Casting  ->  Smaller To Larger -> We Can Convert Explicitly Only

        // Explicitly

        byte intToByte = (byte) n;
        char intToChar = (char) n;
        short intToShort = (short) n;
        int doubleToInt = (int) d;
        int floatToint = (int) fl;
        int longToInt = (int) l;
        float doubleToFloat = (float)d;

        System.out.println(intToByte);
        System.out.println(intToChar);
        System.out.println(intToShort);
        System.out.println(doubleToInt);
        System.out.println(floatToint);
        System.out.println(longToInt);
        System.out.println(doubleToFloat);

    }
}
