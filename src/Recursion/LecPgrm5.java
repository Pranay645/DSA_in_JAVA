package Recursion;

public class LecPgrm5 {
    public static void main(String[] args) {
        System.out.println(getRevNumber(156));
    }
    static int getRevNumber(int n){
        int digit=(int)(Math.log10(n))+1;
        return helperFunc(n,digit);
    }

    private static int helperFunc(int n, int digit) {
        if(n==0){
            return 0;
        }
        int d=n%10;
        int place=(int)(Math.pow(10,digit-1));
        return d*place+helperFunc(n/10,digit-1);
    }
}
