package ArtOfProblemSolving;

public class Raindrops {
    public static void main(String[] args) {
        int num = 30;
        System.out.println(convertToRaindropSounds(num));
    }

    public static String convertToRaindropSounds(int num) {
        StringBuilder result = new StringBuilder();

        if (num % 3 == 0) {
            result.append("Pling");
        }

        if (num % 5 == 0) {
            result.append("Plang");
        }

        if (num % 7 == 0) {
            result.append("Plong");
        }

        return result.length() > 0 ? result.toString() : String.valueOf(num);
    }
}
