package DynamicProgramming;

public class ShortestCommonSubsequence {

    public static void main(String[] args) {
        System.out.println(getSCS("bleed","blue"));
    }
    static String getSCS(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        int[][] dp=new int[m+1][n+1];
        String str="";

        for(int i=0;i<=m;i++) dp[i][0]=0;
        for(int j=0;j<=n;j++) dp[0][j]=0;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char a=str1.charAt(i-1);//because index shifting for base condition
                char b=str2.charAt(j-1);
                if(a==b){  dp[i][j]=1+dp[i-1][j-1];}
                else { dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]); }
            }
        }
        String ans="";
        int i=m,j=n;
        while (i>0 && j>0){
            char a=str1.charAt(i-1);
            char b=str2.charAt(j-1);
            if(a==b){
                ans+=a;
                i--;j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                ans+=a;
                i--;
            }else{
                ans+=b;
                j--;
            }
        }
        while (i>0){
            char a=str1.charAt(i-1);

            ans+=a;
        }
        while (j>0){
            char b=str2.charAt(j-1);
            ans+=b;
        }
        StringBuilder sb=new StringBuilder(ans);

        return ""+sb.reverse();
    }
}
