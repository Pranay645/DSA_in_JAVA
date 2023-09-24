package BinarySearchForMatrix;

import java.util.Arrays;

public class LecPgrm1 {
    public static void main(String[] args) {
    int[][] arr2d={
            {1 ,2 ,3},
            {5 ,6 ,8},
            {10,12,18}
    };
        System.out.println(Arrays.toString(search(arr2d,9)));
    }
    static int[] search(int[][] matrix,int target){
        int r=0;
        int c= matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            else if(target<matrix[r][c]){
                c--;

            }
            else{
                r++;

            }
        }
        return new int[] {-1,-1};
    }
}
