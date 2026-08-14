//Count Occurence of character
//Using hashmp

import java.util.HashMap;

public class OccurStringHashmap {

    public static void main(String[] args){
        String str="Ana";
        //String s=str.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
