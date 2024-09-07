package Tasks.Patterns;

// QUESTION NUM : 29

public class CPrinter {
    public static void main(String[] args) {
        int c = 8;
        for(int i=1;i<=c;i++){
            for(int j=1;j<=c;j++){
                if (i == 1 || j == 1 || i == c) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
