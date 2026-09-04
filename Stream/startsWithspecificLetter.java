import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startsWithspecificLetter {

    public static void main(String[] args){
        List<String> names = Arrays.asList(
                "Anushri", "Amit", "Rahul", "Akash", "Priya"
        );

        List<String> l=names.stream()
                .filter(name->name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(l);
    }
}
