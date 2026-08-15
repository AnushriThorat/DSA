//Reverse each word in a sentence.
//"Java is easy"
//"avaJ si ysae"

public class revWord {
    public static void main(String args[]){
        String s1="Java is hard but lets make easy";
        String word="";

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch!=' '){
                word=ch+word;
            }
            else{
                System.out.print(word+" ");
                word=" ";
            }
        }
        System.out.print(word);
    }
}
