public class SpiralMatrix {
    public static void main(String[] args){
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int left=0;
        int right= matrix.length-1;
        int top=0;
        int bottom= matrix[0].length-1;

        while(top<=bottom && left<=right){

            //left->right
            for(int i=left;i<=right;i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;

            //right->bottom

            for(int j=top;j<=bottom;j++){
                System.out.print(matrix[j][right]+" ");
            }
            right--;

            //right->left

            if(top<=bottom){
                for(int j=right;j>=left;j--) {
                    System.out.print(matrix[bottom][j]+" ");
                }
            }
            bottom--;

            //bottom->top

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }

        }
    }
}
