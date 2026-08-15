//Reverse the words of a sentence.
//"Java is easy"
//"easy is Java"

public class revSentenceWord {
    public static void main(String args[]){
        String str="Java is not easy";
        String word="";

        for(int i=str.length()-1;i>=0;i--) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch + word;
            } else {
                System.out.print(word + " ");
                word = " ";
            }
        }
            System.out.print(word);

    }
}
