import java.util.Arrays;

//divide and merge
public class MergeSort {

    public static void mergeSort(int[] arr,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr,mid+1,end);
            merger(arr,start,mid,end);
        }
    }

    public static void merger(int[] arr,int start,int mid,int end){
        int[]temp=new int[arr.length];
        int i=start;
        int j=mid+1;
        int t_index=start;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[t_index++]=arr[i++];
            }
            else{
                temp[t_index++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[t_index++]=arr[i++];
        }
        while(j<=end){
            temp[t_index++]=arr[j++];
        }

        for(i=start;i<=end;i++){
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args){
        int[] arr={33,11,99,88,55,66,77,22,44};
        int n= arr.length-1;
        mergeSort(arr,0,n);
        System.out.print(Arrays.toString(arr));
    }
}
