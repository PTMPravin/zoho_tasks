package Tasks.Patterns;

// QUESTION NUM : 23

public class PyramidInverted {
    public static void main(String[] args) {
        int num = 9;
        int n = num;
        for(int i=0;i<num;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=num-i;j++){
                System.out.print(n+" ");
            }
            n--;
            System.out.println();
        }
    }
}