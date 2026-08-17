public class Rotate90antimatrix {
    public static void main(String[] args){
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n=matrix.length;

        //transpose matrix

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse column

        for(int i=0;i<n;i++){
            int top=0;
            int bottom=n-1;

            while(top<bottom){
                int temp=matrix[top][i];
                matrix[top][i]=matrix[bottom][i];
                matrix[bottom][i]=temp;

                top++;
                bottom--;
            }
        }

        //print array

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
