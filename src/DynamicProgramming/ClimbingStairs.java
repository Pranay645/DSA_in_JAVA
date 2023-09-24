package DynamicProgramming;

public class ClimbingStairs {
    static int getTotalWays(int n){
        if(n<=1) return n;
        return getTotalWays(n-1)+getTotalWays(n-2);
        //Same as Fibbonacci
    }
    public static void main(String[] args) {

    }
}
