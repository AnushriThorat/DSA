//Find first non-repeated character.

public class FirstNonRepeatedChar {

    public static void main(String[] args){
        String str="madam";

        for(int i=0;i<str.length();i++){
            boolean repeated=false;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    repeated=true;
                    break;
                }
            }
            if(!repeated){
                System.out.println("Find first non-repeated character:"+str.charAt(i));
                break;
            }
        }
    }
}
