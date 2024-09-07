package Tasks.Patterns;

// QUESTION NUM : 26

public class DiamondPattern {
    public static void main(String[] args) {
        int num = 14;
        int len = num+num-1;
        int n = num;
        int stpaces = 0;
        for(int i=1;i<=len;i++){
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            for(int stp=0;stp<stpaces;stp++){
                System.out.print("-");
            }
            for(int k=1;k<=num;k++){
                System.out.print("*");
            }
            if (i < n) {
                stpaces+=2;
                num--;
            }else{
                stpaces-=2;
                num++;
            }
            System.out.println();
        }
    }
}
