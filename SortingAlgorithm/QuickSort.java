/*
1.pick a pivot(pick any random element
2.from left check greater than pivot and right smaller than pivot and swap
 */

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int p_index=partition(arr,low,high);
            quickSort(arr,low,p_index-1);
            quickSort(arr,p_index+1,high);
        }
    }

    public static int partition(int[] arr,int low,int high){
        int i,j;
        int pivot=arr[low];
        i=low;
        j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=high){
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }

    public static void main(String[]args){
        int[] arr = {40, 20, 60, 10, 50, 30};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }
}
