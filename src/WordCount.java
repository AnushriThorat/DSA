import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args){
        String[] str={"banana","apple","banana"};

        Map<String,Integer> map=new HashMap<>();

        for(String word:str){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        System.out.println(map);
    }
}
