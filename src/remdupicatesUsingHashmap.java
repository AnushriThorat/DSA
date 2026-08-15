import java.util.HashMap;

public class remdupicatesUsingHashmap {
    public static void main(String[] args){
        String s1="programming";
        HashMap<Character,Integer> map=new HashMap<>();

        //count character
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //print only once
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

            if(map.get(ch)>0){
                System.out.println(ch);
                map.put(ch,0);
            }
        }
    }
}
