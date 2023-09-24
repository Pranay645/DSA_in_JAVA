package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
//        System.out.println(findLCS("abc","bac",2,2,new int[][]{{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}}));
        String s1="bleed";
        String s2="blue";
        System.out.println(findLCS(s1,s2));
//        System.out.println(findLCS_SpaceOptimised(s1,s2));
    }
    static int findLCS(String str1,String str2,int ind1,int ind2,int[][] dp){
        if(ind1<0 || ind2<0){
//            System.out.println(str);
            return 0;
        }
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        if(str1.charAt(ind1)==str2.charAt(ind2)){
            return dp[ind1][ind2]=1+findLCS(str1,str2,ind1-1,ind2-1,dp);
        }
        else{
            return dp[ind1][ind2]=0+Math.max(findLCS(str1,str2,ind1-1,ind2,dp),findLCS(str1,str1,ind1,ind2-1,dp));
        }
    }

    // MEMOIZATION

    static int findLCS(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        int[][] dp=new int[m+1][n+1];
        String str="";

        for(int i=0;i<=m;i++) dp[i][0]=0;
        for(int j=0;j<=n;j++) dp[0][j]=0;
        char ch='$';
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char a=str1.charAt(i-1);//because index shifting for base condition
                char b=str2.charAt(j-1);
                if(a==b){  dp[i][j]=1+dp[i-1][j-1];  ch=a;}
                else { dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]); }
            }
            str=str+ch;
        }
        System.out.println(str);
        return dp[m][n];

    }

    //Space Optimisation
    static int findLCS_SpaceOptimised(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        int[] prev=new int[n+1];
        int[] curr=new int[n+1];
        String lcs="";
        for(int i=0;i<=n;i++) prev[i]=0;


        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char a=str1.charAt(i-1);//because index shifting for base condition
                char b=str2.charAt(j-1);
                if(a==b){

                    curr[j]=1+prev[j-1];  }
                else { curr[j]=Math.max(prev[j],curr[j-1]); }
            }
            curr=prev;
        }
        return prev[m];

    }
}
