package Oops.Interfaces.Sort;

import java.util.Scanner;
import java.util.Arrays;

interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class QuickSort implements Sortable {

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = helper(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int helper(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class MergeSort implements Sortable {

    public void sort(int[] a)
    {
        mergeSort(a,0,a.length-1);
    }

    public void mergeSort(int[] a, int str, int e)
    {

        if(str>=e)
            return;
        int m=(str+e)/2;

        mergeSort(a, str, m);
        mergeSort(a,m+1,e);

        merge(a, str, m, e);
    }

    public void merge(int[] a, int str, int m, int e)
    {

        int[] r= new int[m-str+1];
        System.arraycopy(a, str , r, 0, r.length);
        int[] l= new int[e-m];
        System.arraycopy(a, m+1 , l, 0, l.length);

        int i=0,j=0,k=str;

        while(i<r.length&&j<l.length)
        {
            if(r[i]<l[j])
            {
                a[k]=r[i++];
            }
            else
                a[k]=l[j++];
            k++;
        }

        while(i<r.length)
        {
            a[k++]=r[i++];
        }

        while(j<l.length)
        {
            a[k++]=l[j++];
        }

    }
}

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Choose sorting algorithm: 1. Bubble Sort  2. Quick Sort  3. Merge Sort");
        int choice = scanner.nextInt();

        Sortable sorter;
        switch (choice) {
            case 1:
                sorter = new BubbleSort();
                break;
            case 2:
                sorter = new QuickSort();
                break;
            case 3:
                sorter = new MergeSort();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        sorter.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        scanner.close();
    }
}
