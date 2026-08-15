//Reverse a string
public class RevString {

    public static void main(String args[]) {
        String str = "Anushri";

        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (ch[left] != ch[right]) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
            }
            left++;
            right--;
        }
        System.out.println("Reverse String:" +new String(ch));
    }
}
