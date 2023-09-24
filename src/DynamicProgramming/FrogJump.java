package DynamicProgramming;

public class FrogJump {
    //We will pass one stair low to match 1st Step and 0th Index confusion
    public static int getMinimalEnergy(int n,int[] energy){
        if(n==0) return 0;
        int oneStep=getMinimalEnergy(n-1,energy)+Math.abs(energy[n-1]-energy[n]);
        int twoStep = 0;
        if (n > 1) {
            twoStep = getMinimalEnergy(n - 2, energy) + Math.abs(energy[n - 2] - energy[n - 1]);
        }
        return Math.max(oneStep, twoStep);
    }

    public static int getMinimalEnergy(int n,int[] energy,int[] dp) {
        if (n == 0) return 0;
        int oneStep=0;
        if(dp[n-1]!=0) oneStep= dp[n-1];
        else oneStep = getMinimalEnergy(n - 1, energy) + Math.abs(energy[n - 1] - energy[n]);

        int twoStep = Integer.MAX_VALUE;
        if (n > 1) {
            if(dp[n-2]!=-1) twoStep=dp[n-2];
            else twoStep = getMinimalEnergy(n - 2, energy) + Math.abs(energy[n - 2] - energy[n]);
        }
        return dp[n]=Math.min(oneStep, twoStep);
    }
    public static void main(String[] args) {

    }
}
