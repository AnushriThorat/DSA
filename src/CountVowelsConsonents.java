//Count vowels and consonants.
//String str="Anushri"
//vowels=3
//consonents=4

public class CountVowelsConsonents {
    public static void main(String[] args)
    {
        String str="dictionary";
        String s=str.toLowerCase();
        char[] ch=s.toCharArray();
        int countV=0;
        int countC=0;

        for(int i=0;i< ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z') {
                if (ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'u' || ch[i] == 'o' || ch[i] == 'e') {
                    countV++;
                } else {
                    countC++;
                }
            }
        }

        System.out.println("Vowels count:"+countV);
        System.out.println("Consonents count:"+countC);
    }
}
