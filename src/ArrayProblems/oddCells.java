package ArrayProblems;

import java.util.Arrays;

public class oddCells {
    class Solution {
        public int oddCells(int m, int n, int[][] indices) {
            int[][] matrix =new int[m][n];
            int count=0;
            for(int i=0;i<matrix.length;i++){
                Arrays.fill(matrix[i],0);

            }


            for(int i=0;i<indices.length;i++){
                int row=indices[i][0];
                int col=indices[i][1];
                for(int j=0;j<m;j++){
                    matrix[j][col]++;

                }
                for(int k=0;k<n;k++){
                    matrix[row][k]++;
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]%2!=0){
                        count++;
                    }
                }
            }
            return count;


        }
    }
}
