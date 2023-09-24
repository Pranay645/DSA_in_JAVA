package ArrayProblems;

public class MatrixReshape {
    class OptimumSolution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            if(mat.length * mat[0].length != r*c){
                return mat;
            }

            int rshape[][] = new int [r][c];

            for (int i = 0;
                 i < c*r; i++) {


                int row1 = i / mat[0].length;
                int col1 = i % mat[0].length;
                int row2 = i / c;
                int col2 = i % c;

                rshape[row2][col2] = mat[row1][col1];

            }

            return rshape;
        }
    }
    class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            if(mat.length*mat[0].length!=r*c){
                return mat;
            }
            int k=0;
            int[] arr=new int[r*c];
            int[][] newArr=new int[r][c];
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    arr[k]=mat[i][j];
                    k++;
                }

            }
            k=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    newArr[i][j]=arr[k];
                    k++;
                }
            }
            return newArr;
        }
    }
}
