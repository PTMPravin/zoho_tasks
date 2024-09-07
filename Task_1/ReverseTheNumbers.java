package Tasks;

// QUESTION NUM : 9

public class ReverseTheNumbers {
    public static void main(String[] args) {
        int num = 12345;
        int n = num;
        int pow = 0;
        int ans = 0;
        while (num != 0) {
            pow++;
            num/=10;
        }
        pow-=1;
        while (n != 0) {
            int rem = n%10;
            ans+=rem*(int)Math.pow(10, pow--);
            n/=10;
        }

        System.out.println(ans);
    }
}
