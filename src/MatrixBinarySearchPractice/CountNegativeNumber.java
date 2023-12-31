package MatrixBinarySearchPractice;

public class CountNegativeNumber {
    class Solution {
        public int countNegatives(int[][] grid) {
            int r=0;
            int c=grid[0].length-1;
            int count=0;
            while(r<grid.length && c>=0){
                if(grid[r][c] >= 0){
                    r++;
                }
                else{
                    count=count+(grid.length-r);
                    c--;
                }
            }
            return count;
        }
    }
}
