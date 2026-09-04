import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class sumofAllNo {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(10,2,3,4,5);

        //using reduce
        int sum=list.stream()
                .reduce(0,(a,b)->a+b);

        System.out.println(sum);

        //using
        int s=list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        //min
        int min=list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);
        System.out.println(min);

        //max
        int max=list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println(max);
    }
}
