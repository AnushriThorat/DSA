import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNo {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(10,2,3,7,4,9);


        List<Integer> l=list.stream()
                .sorted() //it print list in ascending order
                .limit(1) //it print smallest element
                .toList();

        System.out.println("smallest element in list:"+l);

        List<Integer> l1=list.stream()
                .sorted(Comparator.reverseOrder()) //it print list in descending order
                .limit(1) //print largest
                .toList();

        System.out.println("Largest element in list:"+l1);

    }
}
