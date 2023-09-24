package RecursionPractice;

public class PP5 {
    public static void main(String[] args) {
        System.out.println(isPowerFour(8,0));
    }
    static boolean isPowerFour(int n,int m){
        if(n==1){
            if(m==0) return true;
            else return false;
        }
        if(n==0){
            return false;
        }
        return isPowerFour(n/4,n%4);
    }
}
