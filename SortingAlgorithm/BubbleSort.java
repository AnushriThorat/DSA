import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n= arr.length;
        for(int i=n-1;i>=0;i--){

            for(int j=0;j<i;j++){
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr={64,25,12,22,11};
        //int[] arr={1,2,3,4};

        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
