package Tasks.Patterns;

// QUESTION NUM : 24

public class PyramidByNumbers {
    public static void main(String[] args) {
        int num = 6;
        int curr_Num = 1;
        int stpaces = num;
        for(int i=1;curr_Num<=num;i++){
            for(int stp=stpaces;stp>0;stp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(curr_Num++ + " ");
            }
            stpaces--;
            System.out.println();
        }
    }
}
