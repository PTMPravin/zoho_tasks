package Tasks.Matrix;

// QUESTION NUM : 19

public class LeftRotate {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int tmp = arr[j][i];
                arr[j][i] = arr[arr.length-1-j][i];
                arr[arr.length-1-j][i] = tmp;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
