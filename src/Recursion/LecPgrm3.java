package Recursion;

public class LecPgrm3 {
    public static void main(String[] args) {
        System.out.println(getFactorial(4));
    }
    static int getFactorial(int n){
        if(n==1){
            return 1;
        }
        return n*getFactorial(n-1);
    }
}
