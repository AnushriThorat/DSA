//Find leaders in an array
//[16,17,4,3,5,2]
//Leaders: 17,5,2
//it gives output: 2,5,17
//if you want : 17,5,2
//then use count
public class findLeaders {
    public static void main(String args[])
    {
        /*int arr[]={16,17,4,3,5,2};
        int leader=arr[arr.length-1];

        System.out.print("leader:"+leader+" ");

        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]>leader) {
                leader = arr[i];
                System.out.print(leader+" ");
            }
        }*/
        int arr[]={16,17,4,3,5,2};
        int count=0;
        int leader=arr[arr.length-1];

        int leaders[]=new int[arr.length];
        leaders[count]=leader;
        count++;

        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]>leader){
                leader=arr[i];

                leaders[count]=leader;
                count++;
            }
        }

        for(int i=count-1;i>=0;i--){
            System.out.print(leaders[i]+" ");
        }
    }
}
