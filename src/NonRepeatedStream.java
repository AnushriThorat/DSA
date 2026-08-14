//Find first non-repeated character in string

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class NonRepeatedStream {
    public static void main(String[] args){
        String str="swiss";
        Optional<Character>res=str.chars()//Converts the String into a stream of character values.
                .mapToObj(c->(char)c) //Converts those integer values back to characters
                .filter(ch->str.indexOf(ch)==str.lastIndexOf(ch))
                .findFirst();
        System.out.println(res.orElse(null));
    }
}
