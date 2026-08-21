//Input:
//nums = [2,7,11,15]
//target = 9
//
//Output:
//        [0,1]

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int arr[]={2,7,11,15};

        int target=18;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i< arr.length;i++){
            int required=target-arr[i];

            if(map.containsKey(required)){
                System.out.println("["+map.get(required)+","+i+"]");
                break;

            }
            map.put(arr[i],i);
        }
    }
}
