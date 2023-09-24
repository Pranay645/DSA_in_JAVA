package Recursion;
/*
*    *****
*    ****
*    ***
*    **
*    *
* */
public class LecPgrm9 {
    public static void main(String[] args) {

        drawPattern1(5,0);
    }
    static void drawPattern1(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            drawPattern1(r,c+1);
        }
        else{
            System.out.println("");
            drawPattern1(r-1,0);
        }
    }
}
