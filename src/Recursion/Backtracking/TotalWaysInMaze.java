package Recursion.Backtracking;

import java.util.Arrays;

public class TotalWaysInMaze {
    public static void matrix(int[][] mat,int i,int j){
        if(i==mat.length){
            return;
        }
        mat[i][j]=-1;
        matrix(mat,i+1,j);
    }
//    static void totalWays()
    public static void main(String[] args) {
//        int[][] mat=new int[3][3];
//        matrix(mat,0,0);
//        System.out.println(Arrays.toString(mat[0]));
//        System.out.println(Arrays.toString(mat[1]));
//        System.out.println(Arrays.toString(mat[2]));
        System.out.println("0P".toLowerCase());

    }
}
