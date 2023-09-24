package Recursion.Backtracking;

import java.util.Arrays;

public class BackTrackingAllPath {
    public static void main(String[] args) {
        boolean[][] bool={{true,true,true},
                        {true,true,true},
                        {true,true,true}};
        int[][] path={{0,0,0},
                    {0,0,0},
                    {0,0,0}};
//        AllPath("",0,0,bool);
        printMatPath(1,0,0,path);

    }
    public static void AllPath(String path,int col,int row,boolean[][] mat){
        if(col==2 && row==2){
            System.out.println(path);
            return ;
        }
        if(!mat[row][col]) return;
        mat[row][col]=false;
        if(row<2){
            AllPath(path+"D",col,row+1,mat);
        }
        if(col<2){
            AllPath(path+"R",col+1,row,mat);
        }
        if(row>0){
            AllPath(path+"U",col,row-1,mat);
        }
        if(col>0){
            AllPath(path+"L",col-1,row,mat);
        }
        mat[row][col]=true;
        return;
    }


    public static void printMatPath(int level,int col,int row,int[][] mat){
        if(col==2 && row==2){
            mat[2][2]=level;
            for(int i=0;i< mat.length;i++){
                System.out.println(Arrays.toString(mat[i]));

            }
            System.out.println("--------------------------------------------------------------");
            mat[2][2]=0;
            return ;
        }
        if(mat[row][col]!=0) return;
        mat[row][col]=level;
        if(row<2){
            printMatPath(level+1,col,row+1,mat);
        }
        if(col<2){
            printMatPath(level+1,col+1,row,mat);
        }
        if(row>0){
            printMatPath(level+1,col,row-1,mat);
        }
        if(col>0){
            printMatPath(level+1,col-1,row,mat);
        }
        mat[row][col]=0;
        return;
    }
}
