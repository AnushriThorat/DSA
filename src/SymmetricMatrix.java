public class SymmetricMatrix {
    public static void main(String[] args){
        int[][] matrix={
                {1,2,3},{2,8,5},{7,5,6}
        };
        int rows=matrix.length;
        int col=matrix[0].length;
        boolean symmetric=true;

        if(col!=rows){
            symmetric =false;
        }
        else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        symmetric=false;
                        break;
                    }
                }
                if(!symmetric){
                    break;
                }
            }
        }
        if(symmetric){
            System.out.println("Matrx is symmetric");
        }
        else{
            System.out.println("Not symmentric");
        }
    }
}
