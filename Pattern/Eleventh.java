import java.util.Scanner;
/*
A
AB
ABC
ABCD
ABCDE
 */
public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
