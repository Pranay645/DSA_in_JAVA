package DynamicProgramming;

import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] dp=new int[4];
        Arrays.fill(dp,-1);
        System.out.println(maxSubArray(3,new int[]{1,2,9,4},dp));
        System.out.println(maxSubArray(new int[]{1,2,9,4}));
    }
    static int maxSubArray(int index,int[] arr){
        if(index==0) return arr[index];
        if(index<0) return 0;
        int left=arr[index]+maxSubArray(index-2,arr);
        int right=0+maxSubArray(index-1,arr);
        return Math.max(left,right);
    }
    //Recursion using DP
    static int maxSubArray(int index,int[] arr,int[] dp){
        if(index==0) return arr[index];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        int left=arr[index]+maxSubArray(index-2,arr);
        int right=0+maxSubArray(index-1,arr);
        return dp[index]=Math.max(left,right);
    }

    //Tabulation
    static int maxSubArray(int[] arr){
        int prev1=arr[0];
        int prev2=0;
        for(int i=1;i<arr.length;i++){
           int take=arr[i]+prev2;
           int nonTake=0+prev1;
           int curr=Math.max(take,nonTake);
            prev2=prev1;
            prev1=curr;

        }
        return prev1;
    }


}
