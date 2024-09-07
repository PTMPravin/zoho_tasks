package Tasks.CodingBat.APOne;

public class DividesSelf {
    public static void main(String[] args) {
        int num = 12;
        System.out.println(isDivide(num));
    }
    public static boolean isDivide(int num){
        int n = num;
        while (n != 0) {
            int rem = n%10;
            if (rem == 0) {
                return false;
            }else{
                if (num%rem != 0) {
                    return false;
                }
            }
            n/=10;
        }
        return true;
    }
}
