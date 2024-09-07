package Tasks;

// QUESTION NUM : 27

public class StringPrsentOrNot {
    public static void main(String[] args) {
        String str_1 = "test123string";
        String str_2 = "123";
        System.out.println(customIndexOf(str_1, str_2));
    }
    public static int customIndexOf(String str_1 ,String str_2){
        /*we can simply use this -> return str_1.indexOf(str_2) */

        int len = str_2.length();
        int i = 0;
        int j = i+len-1;
        int tempIndex = 0;
        String st = "";
        while (j < str_1.length()) {
            st = "";
            tempIndex = i;
            while (tempIndex <= j) {
                st+=str_1.charAt(tempIndex++);
            }
            if (st.equals(str_2)) {
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}
