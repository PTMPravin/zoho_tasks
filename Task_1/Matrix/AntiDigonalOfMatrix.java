package Tasks.Matrix;

import java.util.ArrayList;
import java.util.List;

// QUESTION NUM : 30

public class AntiDigonalOfMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(arr[0][0]);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                List<Integer> num = new ArrayList<>();
                int ii = i;
                int jj = j;
                while (ii < arr.length && jj >= 0) {
                    num.add(arr[ii++][jj--]);
                }
                list.add(num);
            }
        }
        list.add(new ArrayList<>());
        list.get(list.size()-1).add(arr[arr.length-1][arr.length-1]);
        System.out.println(list);
    }
}
