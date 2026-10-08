import java.util.Scanner;
/*
  *
 ***
*****
//[space,star,space]
  [2,1,2]
  [1,3,1]
  [0,5,0]
 */
public class Fifth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no of rows:");
        int n=sc.nextInt();
        //rows
        for(int i=0;i<n;i++){

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
