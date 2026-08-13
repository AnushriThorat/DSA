//Check if two arrays are equal
//Without using Arrays.equals()

public class equalArray {
    public static void main(String[] args){
        int a1[]={1,2,3,6,4};
        int a2[]={3,4,2,6,1};

        boolean equal=true;

        //check if there length is equal then it is equal
        if(a1.length!=a2.length){
            equal=false;
        }
        else{
            boolean visited[]=new boolean[a2.length];
            for(int i=0;i<a1.length;i++){
                boolean found=false;
                for(int j=0;j<a2.length;j++){
                    if(a1[i]==a2[j] && !visited[j])
                    {
                        visited[j]=true;
                        found=true;
                        break;
                    }
                }
                if(!found){
                    equal=false;
                }
            }
        }
        if (equal) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
