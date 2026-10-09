import java.util.Arrays;

public class SelectionSort {

    public static void selectionsort(int[] arr)
    {
        for(int i=0;i< arr.length;i++) {
            int min_ele = arr[i];
            int pos = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<min_ele){
                    min_ele=arr[j];
                    pos=j;
                }
            }
            arr[pos]=arr[i];
            arr[i]=min_ele;
        }
    }

    public static void main(String[] args){
        int[] arr={64,25,12,22,11};

        selectionsort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
