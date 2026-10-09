import java.util.HashMap;
import java.util.Map;

//Find Duplicate Characters in a String
//Write a Java program to find all duplicate characters in a String.
//
//📌 Input:
//
//String str = "programming";
//
//🎯 Expected Output:
//
//Duplicate characters: r, g, m
public class duplcateCharinString {
    public static void main(String[] args){
        String str="programming";

        //using brute force
        int[] count=new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            count[ch-'a']++;
        }
        for(int i=0;i< count.length;i++){
            if(count[i]>1){
                char ch=(char)(i+'a');
                System.out.print(ch);
            }
        }

        //using hashmap

        Map<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        boolean first=true;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey());

            }
        }
    }

}
