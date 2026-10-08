import java.util.Scanner;
/*
    A
   ABA
  ABCBA

  [space,char,space]
  [2,1,2]
  [1,3,1]
  [0,3,0]
 */
public class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //character
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }
                else {
                    ch--;
                }
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
