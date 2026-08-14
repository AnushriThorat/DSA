//Using stream print even no

import java.util.ArrayList;
import java.util.List;

public class EvenStream {
    public static void main(String[] args){
        List<Integer>  list=new ArrayList<Integer>(List.of(10,2,3,41,56));

        List<Integer> res=list.stream()
                .filter(x->x%2==0)
                .toList();
        System.out.println(res);
    }
}
