//Check whether two strings are anagrams.
//"listen" and "silent"

public class anagramString {
    public static void main(String[] args){
        String s1="listen";
        String s2="silent";

        if(s1.length()!=s2.length()){
            System.out.println("String is not anagram");
            return;
        }
        int[] count=new int[26];

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        boolean anagram=true;

        for(int i=0;i<26;i++){
            if(count[i]!=0){
                anagram=false;
                break;
            }
        }

        if(anagram){
            System.out.println("String is anagram");
        }
        else{
            System.out.println("String is not anagram");
        }
    }
}
