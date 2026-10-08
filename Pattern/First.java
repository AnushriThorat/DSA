/*
*****
*****
*****
*****
 */

import java.util.Scanner;

public class First {

    public static void first(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row=sc.nextInt();
        System.out.println("Enter no of columns:");
        int col=sc.nextInt();

        first(row,col);

    }

}
