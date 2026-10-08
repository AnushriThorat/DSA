/*
*****
 ***
  *
//[space,star,space]
  [0,5,0]
  [1,3,1]
  [2,1,2]
 */

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no of rows:");
        int n=sc.nextInt();
        //rows
        for(int i=0;i<n;i++) {

            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
