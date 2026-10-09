//it always take element and places it in its correct position

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int n= arr.length;
        int j;
        for(int i=0;i<n-1;i++){
            int new_ele=arr[i+1];
            j=i+1;

            while(j>0 && arr[j-1]>new_ele){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=new_ele;
        }
    }

    public static void main(String[] args){
        int[] arr={9,12,14,15,6,8,13};
        insertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
