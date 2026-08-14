import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareStream {

    public static void main(String[] args){
        List<Integer> li= new ArrayList<>(List.of(11,2,3,4,6));

        List<Integer> res=li.stream()
                .map(x->x*x)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
