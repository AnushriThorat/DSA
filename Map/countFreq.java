import java.util.HashMap;
import java.util.Map;

public class countFreq {

    public static void main(String args[]){
        int a[]={1,2,3,4,1};
        Map<Integer,Integer> map=new HashMap<>();

        //First approach
//        for(int i=0;i<a.length;i++){
//            if(map.containsKey(a[i])){
//                map.put(a[i],map.get(a[i])+1);
//            }
//            else{
//                map.put(a[i],1);
//            }
//        }
//        System.out.println(map);

        //second approach
//        for(int num:a){
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//
//        System.out.println(map);

        //Third approach
        boolean visited[] =new boolean[a.length];
        int count;

        for(int i=0;i<a.length;i++){

            if(visited[i])
            {
                continue;
            }
            count=1;

            for(int j=i+1;j<a.length;j++){

                if(a[i]==a[j]){
                    visited[j]=true;
                    count++;

                }
            }
            System.out.println(a[i]+"count is:"+count);
        }

    }
}
