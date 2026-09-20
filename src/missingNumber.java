public class missingNumber {
    public static void main(String[] args){
        int[] arr={6,7,8,5,4,1,10};

        int max=arr[0];

        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int[] count=new int[max+1];
        for(int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }

        for(int i=1;i<=max;i++){
            if(count[i]==0){
                System.out.print(i+" ");
            }
        }
    }
}
