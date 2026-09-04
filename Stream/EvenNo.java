import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNo {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(10,15,20,25,30);

        System.out.println("Even No are:");
        list.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);

        System.out.println("odd no are:");
        list.stream()
                .filter((x->x%2!=0))
                .forEach(System.out::println);

    }
}
