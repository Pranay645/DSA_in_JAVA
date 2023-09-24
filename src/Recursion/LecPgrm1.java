package Recursion;

public class LecPgrm1 {
    public static void main(String[] args) {
        System.out.println(getFibonnaci(4));
    }
    static int getFibonnaci(int n){
        if(n<2){
            return n;
        }
        return getFibonnaci(n-1)+getFibonnaci(n-2);
    }
}
