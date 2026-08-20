public class winSum {

    public static void maxSum(int[] arr,int k){

        int winsum=0;

        for(int i=0;i<k;i++){
            winsum=winsum+arr[i];
        }

        int maxsum=winsum;

        for(int i=k;i< arr.length;i++) {
            winsum = winsum + arr[i] - arr[i - k];

            if (maxsum < winsum) {
                maxsum = winsum;
            }
        }
        System.out.println(maxsum);

    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int k=3;

        maxSum(arr,k);
    }
}
