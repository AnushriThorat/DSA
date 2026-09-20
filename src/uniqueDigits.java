public class uniqueDigits {

    public static void main(String[] args){
        int num=4353;

        boolean[] visited=new boolean[10];

        int count=0;

        while(num>0){
            int digit=num%10;

            if(!visited[digit]){
                visited[digit]=true;
                count++;
            }

            num=num/10;
        }

        System.out.println(count);
    }
}
