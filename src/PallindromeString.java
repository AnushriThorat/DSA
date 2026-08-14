//Check whether a string is palindrome.
//"madam" → true

public class PallindromeString {
    public static void main(String[] args)
    {
        String str1="Madam";
        String str=str1.toLowerCase();
        char[] ch=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        boolean flag=true;

        while(left<=right){

            if(ch[left]!=ch[right]){
                flag=false;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.println("String is pallindrome");
        }
        else{
            System.out.println("String is not pallindrome");
        }
    }
}
