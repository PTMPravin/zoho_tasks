package Tasks;

// QUESTION NUM : 11

public class StringPrinter {
    
    public static void main(String[] args) {
        String str = "a1b1c11";
        String ch = "";
        String number = "";
        int i=0;
        while(i<str.length()){
            int n = str.charAt(i);
            if (isCharacter(n)) {
                ch+=str.charAt(i);
            }else{
                number+=str.charAt(i);
            }
            if (i == str.length()-1 || isCharacter(str.charAt(i+1))) {
                print(ch , number);
                ch = "";
                number = "";
            }
            i++;
        }
    }

        public static boolean isCharacter(int n){
            if (n >= 65 && n <= 90 || n >=97 && n <=122) {
                return true;
            }
            return false;
        }
    
        public static void print(String ch , String number){
            int n = Integer.parseInt(number);
            int i=0;
            while (i < n) {
                System.out.println(ch);
                i++;
            }
        }
}
