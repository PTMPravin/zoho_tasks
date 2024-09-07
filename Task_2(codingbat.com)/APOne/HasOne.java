package Tasks.CodingBat.APOne;

public class HasOne {
    public static void main(String[] args) {
        int num = 01;
        System.out.println(isOneDigit(num));
    }
    public static boolean isOneDigit(int num){
        while (num != 0) {
            int rem = num%10;
            if (rem == 1) {
                return true;
            }
            num/=10;
        }
        return false;
    }
}
