import java.util.Arrays;
import java.util.List;

public class greaterNo {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(10,20,45,32,7);

        list.stream()
                .filter(x->x>40)
                .forEach(System.out::println);
    }
}
