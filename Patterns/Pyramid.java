package Tasks.Patterns;

// QUESTION NUM : 21

public class Pyramid {
    public static void main(String[] args) {
        int n = 9;
        int num = n;
        int stpaces = n-1;
        for(int i=1;i<=9;i++){
            for(int stp=stpaces;stp>=1;stp--){
                System.out.print(" ");
            }
            int lest = n;
            int right = num-1;
            for(int j=1;j<=i*2-1;j++){
                if (lest <= 9) {
                    System.out.print(lest++);
                }else{
                    System.out.print(right--);
                }
            }
            n--;
            stpaces--;
            System.out.println();
        }
    }
}
