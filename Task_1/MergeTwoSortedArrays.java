package Tasks;

// QUESTION NUM : 16

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr_1[] = {2,4,5,6,7,9,10,13};
        int arr_2[] = {2,3,4,5,6,7,8,9,11,15};
        int ans_arr[] = new int[arr_1.length+arr_2.length];
        int i=0;
        int j=0;
        int index = 0;
        while (i < arr_1.length || j < arr_2.length) {
            if (i < arr_1.length && j < arr_2.length && arr_1[i] <= arr_2[j]) {
                ans_arr[index++] = arr_1[i];
                if (arr_1[i] == arr_2[j]) {
                    j++;
                }
                i++;
            }else if (i < arr_1.length && j < arr_2.length && arr_1[i] > arr_2[j]) {
                ans_arr[index++] = arr_2[j];
                j++;
            }else if (j < arr_2.length && i >= arr_1.length) {
                ans_arr[index++] = arr_2[j];
                j++;
            }else{
                ans_arr[index++] = arr_1[i];
                i++;
            }
        }
        for(int k=0;k<ans_arr.length;k++){
            if (ans_arr[k] != 0) {
                System.out.print(ans_arr[k] + " ");
            }
        }
    }
}
