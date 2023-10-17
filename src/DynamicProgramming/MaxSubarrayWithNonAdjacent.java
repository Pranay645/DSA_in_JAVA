package DynamicProgramming;

public class MaxSubarrayWithNonAdjacent {
    public static void main(String[] args) {

    }
    public static int getMaxSum(int[] arr){
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            int take=arr[i];
            if(i>1){
                take+=dp[i-2];
            }
            int nonTake=dp[i-1];
            dp[i]=Math.max(take,nonTake);
        }
        return dp[arr.length-1];
    }
}
