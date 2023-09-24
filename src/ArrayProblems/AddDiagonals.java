package ArrayProblems;

public class AddDiagonals {
    class Solution {
        public int diagonalSum(int[][] mat) {
            int leftDiagSum = 0;
            int rightDiagSum = 0;
            for(int i = 0 ; i < mat.length ; i++)
            {
                int j = mat.length - i - 1;
                int a = mat[i][i];
                int b = mat[i][j];
                if(i == j)
                {
                    leftDiagSum += a;
                }
                else
                {
                    leftDiagSum += a;
                    rightDiagSum += b;
                }
            }
            return (leftDiagSum + rightDiagSum);
        }
    }
}
