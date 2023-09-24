package Recursion;

public class LecPgrm4 {
    public static void main(String[] args) {
        System.out.println(getSumOfDigit(0000));
    }
    static int getSumOfDigit(int n){
        if(n<=0){
            return 0;
        }
        int d=n%10;
        return d+getSumOfDigit(n/10);
    }
}
