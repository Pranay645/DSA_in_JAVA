package Recursion;

public class LecPgrm6 {
    public static void main(String[] args) {
        System.out.println(countZero(30409,0));
    }
    static int countZero(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return countZero(n/10,count+1);
        }
        else{
            return countZero(n/10,count);
        }
    }
}
