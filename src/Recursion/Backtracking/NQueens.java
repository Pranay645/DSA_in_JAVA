package Recursion.Backtracking;

import java.util.Arrays;


public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] mat=new boolean[n][n];
        System.out.println(totalWays(mat,0));
    }
    public static int totalWays(boolean[][] mat,int row){
        if(row== mat.length){
           displayMat(mat);
            System.out.println("----------------------------------------");
            return 1;
        }
        int count=0;
        for(int col=0;col<mat.length;col++){
            if(isSafe(mat,row,col)){
                mat[row][col]=true;
                count+=totalWays(mat,row+1);
                mat[row][col]=false;
            }
        }
        return count;
    }

    private static void displayMat(boolean[][] mat) {
        for(boolean[] arr: mat){
            for(boolean element:arr){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }

    private static boolean isSafe(boolean[][] mat, int row, int col) {
        //Vertical check
        for(int i=0;i<row;i++){
            if(mat[i][col]){
                return false;
            }
        }

        //Left Diagonal
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(mat[row-i][col-i]){
                return false;
            }
        }

        //Right Diagonal
        int maxRight=Math.min(row,mat.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(mat[row-i][col+i]){
                return false;
            }

        }
        return true;
    }
}
