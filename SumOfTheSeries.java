package Tasks;

// QUESTION NUM : 28

public class SumOfTheSeries {
    public static void main(String[] args) {
        int num = 3;
        int n = 0;
        int i = 1;
        int ans = 0;
        int power = 0;
        while (i <= num) {
            int l = n+(int)Math.pow(10,power);
            ans+=n+(int)Math.pow(10,power);
            n = l;
            i++;
            power++;
        }
        System.out.println(ans);
    }
}
