package Tasks;

// QUESTION NUM : 5

public class PolynomialEquation {
    public static void main(String[] args) {
        int arr[] = {1,5,6};//this represent 6x^2 + 5x + 6 = 0 
        int bsquare = (int)Math.pow(arr[1],2);
        int ac4 = 4*arr[0]*arr[2];
        int a2 = 2*arr[0];
        int numarator = -arr[1] + (int)Math.sqrt(bsquare-ac4);
        int numarator_2 = -arr[1] - (int)Math.sqrt(bsquare-ac4);
        int denomirator = a2;
        int ans = numarator/denomirator;
        int ans_2 = numarator_2/denomirator;
        System.out.println(ans);
        System.out.println(ans_2);
    }
}
