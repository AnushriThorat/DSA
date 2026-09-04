import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicates {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(10,2,3,4,2,5,4);

        List<Integer> l=list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(l);
    }
}
