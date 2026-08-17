public class TransposeMatrix {

    public static void main(String[] args){
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int rows=matrix.length;
        int col=matrix[0].length;

        int[][] transpose=new int[col][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
