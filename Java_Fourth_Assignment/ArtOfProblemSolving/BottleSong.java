package ArtOfProblemSolving;

public class BottleSong {
    public static void main(String[] args) {
        int bottles = 10;
            
        for (int i = bottles; i > 0; i--) {

            System.out.println(i + " green bottles hanging on the wall,");
            System.out.println(i + " green bottles hanging on the wall,");
                    
            System.out.println("And if one green bottle should accidentally fall,");
        
            int newCount = i - 1;
                    
            if (newCount > 0) {
                System.out.println("There'll be " + newCount + " green bottles hanging on the wall.\n");
            } else {
                System.out.println("There'll be no green bottles hanging on the wall.\n");
            }
        }
    }
}
