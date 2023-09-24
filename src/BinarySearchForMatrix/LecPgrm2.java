package BinarySearchForMatrix;
//For Strict Ordered 2D Array
public class LecPgrm2 {
    public static void main(String[] args) {

    }
     static int [] oneDBinarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid] ==target){
                return new int[]{row,mid};
            }
            if(target<matrix[row][mid]){
                cEnd=mid-1;
            }
            else{
                cStart=mid+1;
            }
        }
        return new int[]{-1,-1};
     }
     static int[] twoDBinarySearch(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;

        if(rows==1){
            return oneDBinarySearch(matrix,0,0,cols-1,target);
        }
        return null;
     }
}
