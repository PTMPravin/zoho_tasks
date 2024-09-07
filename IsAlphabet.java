package Tasks;

// QUESTION NUM : 12

public class IsAlphabet {
    public static void main(String[] args) {
        char acsii = 'a';
        if (acsii >= 65 && acsii <= 90 || acsii >= 97 && acsii <= 122) 
            System.out.println("Alphabet");
        else
            System.out.print("Not");
    }
}