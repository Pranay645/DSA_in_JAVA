package DynamicProgramming;

public class minCostClimbingStair {
    public int minCostClimbingStairs(int[] cost) {
        int[] newCost=new int[cost.length+1];
        int i=0;
        for(i=0;i<cost.length;i++){
            newCost[i]=cost[i];
        }
        newCost[i]=0;
        return minCostClimbingStairs(newCost,cost.length);

    }
    static int minCostClimbingStairs(int[] cost,int n) {
        if(n<=1){
            return cost[n];
        }

        int left=cost[n]+minCostClimbingStairs(cost,n-1);
        int right=cost[n]+minCostClimbingStairs(cost,n-2);

        return Math.min(left,right);

    }

    //Space Optimised

    static int minCost(int[] cost){
        int prev1=0;
        int prev2=0;
        for(int i=cost.length-1;i>=0;i--){
            cost[i]+=Math.min(prev1,prev2);
            prev2=prev1;
            prev1=cost[i];
        }
        return Math.min(cost[0],cost[1]);
    }
}
