package Recursion.Backtracking;

public class MazePblm {
    static int countTotalWays(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        return countTotalWays(row-1,col) + countTotalWays(row,col-1);
    }
    static int printWays(String way,int row,int col){
        if(row==1 && col==1){
            System.out.println(way);
            return 1;
        }
        if(row<0 || col<0){
            return 0;
        }
        int down=printWays(way+'D',row-1,col);
        int right=printWays(way+'R',row,col-1);
        return down+right;
    }
    //You can move diagonall too
    static int countTotalWays2(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        return countTotalWays2(row-1,col) + countTotalWays2(row,col-1)+countTotalWays2(row-1,col-1);
    }
    //Obstacle at 2,2
    static int countTotalWays3(String path,int row,int col){
        if(row==2 && col==2){
            return 0;
        }
        if(row==1 && col==1){
            System.out.println(path);
            return 1;
        }
        int left=0,right=0;
        if(row>0){
            left=countTotalWays3(path+'D',row-1,col);
        }
        if(col>0){
            right=countTotalWays3(path+'R',row,col-1);
        }
        return left+right ;
    }

    //All direction are allowed within grid from (0,0) to (2,2)
    static int allPath(String path,int row,int col){
        if(row==1 && col==1){
            return 1;
        }

        int left=0,right=0;
        if(row<3){
            left=allPath(path+'D',row+1,col);
        }
        if(col<3){
            right=allPath(path+'R',row,col+1);
        }
        return left+right ;
    }

    public static void main(String[] args) {
//        int num=printWays("",3,3);
//        System.out.println(countTotalWays2(3,3));
        System.out.println(countTotalWays3("",3,3));
        //Cjeck if bool arr will remain same after recursion
    }

}
