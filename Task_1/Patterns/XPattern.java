package Tasks.Patterns;

// QUESTION NUM : 25

public class XPattern {
    public static void main(String[] args) {
        String num = "1234567";
        for(int i=0;i<num.length();i++){
            for(int j=0;j<num.length();j++){
                if (i == j) {
                    System.out.print(num.charAt(j));
                }else if (i+j == num.length()-1) {
                    System.out.print(num.charAt(j));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
