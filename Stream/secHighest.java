import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secHighest {

    public static void main(String[] args){
        List<Integer> l= Arrays.asList(10,2,3,6,7,8,70);

        int secHighest=l.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second highest:"+secHighest);
    }
}
