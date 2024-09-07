package Tasks.CodingBat.APOne;

public class CompareTwo {
    public static void main(String[] args) {
        String nameA = "bb";
        int idA = 1;
        String nameB = "zz";
        int idB = 2;
        System.out.println(userCompare(nameA, idA, nameB, idB));
    }
    public static int userCompare(String nameA, int idA, String nameB, int idB){
        int compareValue = nameA.compareTo(nameB);
        if (compareValue == 0) {
            if (idA == idB) {
                return 0;
            }else{
                return idA > idB ? 1 : -1;
            }
        }
        return nameA.compareTo(nameB) < 0 ? -1 : 1;
    }
}
