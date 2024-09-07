package Tasks.CodingBat.APOne;

public class CommonTwo {
    public static void main(String[] args) {
        String arrA[] = {"a", "a", "b", "b", "c"};
        String arrB[] = {"a", "b", "b", "b", "c"};
        System.out.println(count(arrA, arrB, arrB, 0));
    }
    public static int count(String arrA[], String arrB[],String ans[], int n){
        int i = 0;
        int j = 0;
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        while (i < arrA.length && j < arrB.length) {
                num1 = arrA[i].charAt(0);
                num2 = arrB[j].charAt(0);
            if (num1 == num2) {
                if (i == 0) {
                    count++;
                }else if (i > 0 && arrA[i] != arrA[i-1]) {
                    count++;
                }
                i++;
                j++;
            }else if (num2 > num1) {
                i++;
            }else{
                j++;
            }
        }
        return count;
    }
}
