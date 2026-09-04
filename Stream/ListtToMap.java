import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListtToMap {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Amit", "Rahul", "Priya");

        Map<String,Integer> map=names.stream()
                .collect(Collectors.toMap(name->name,name-> name.length()));

        System.out.println(map);
    }
}
