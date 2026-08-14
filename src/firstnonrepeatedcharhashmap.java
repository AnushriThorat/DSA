import java.util.HashMap;

//Find first non-repeated character.
public class firstnonrepeatedcharhashmap {
    public static void main(String[] args){
        String str="madam";
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(map.get(ch)==1){
                System.out.println("Find first non-repeated character:"+str.charAt(i));
                break;
            }
        }
    }
}
