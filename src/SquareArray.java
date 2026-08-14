//Square Elements and Arrange in Ascending Order Using TreeMap
//Input:  [-4, -2, 1, 3]
//Output: [1, 4, 9, 16]

import java.util.Map;
import java.util.TreeMap;

public class SquareArray {

    public static void main(String args[]){
        int[] arr={-4,-2,1,3,4};

        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int i=0;i< arr.length;i++){
            int square=arr[i]*arr[i];

            map.put(square, map.getOrDefault(square,0)+1);
        }

        //Printing array

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value= entry.getKey();
            int freq=entry.getValue();

            for(int i=0;i<freq;i++){
                System.out.print(value+" ");
            }
        }
    }
}
