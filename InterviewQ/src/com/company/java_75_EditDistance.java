package com.company;

public class java_75_EditDistance {
    static int editDistance(String a , String b){
        int m = a.length();
        int n = b.length();
        int dp[][]=new int[m+1][n+1];// because at 0 "" empty String

        //initialize the first col with zeros's
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }

        //initialize the first row with zero's
        for(int j=0;j<=n;j++){
            dp[0][j] = j;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]; // digonally
                }else {
                    dp[i][j] =1+ Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);//left right and digonally
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        int ans= editDistance("horse","ros");
        System.out.println(ans);    
    }
}
