import java.util.HashMap;
import java.util.Map;

public class firstNonRepeating {

    public static void main(String args[]){
//        String str="abcdabcefd";
//        int count[]=new int[26];
//
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            count[ch-'a']++;
//        }
//
//        for(int i=0;i<str.length()-1;i++) {
//            char ch=str.charAt(i);
//            if (count[ch-'a'] ==1) {
//                System.out.println(ch);
//                break;
//            }
//        }

        Map<Character,Integer> map=new HashMap<>();

        String str="wabcabcef";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
}
