package com.company;

public class java_45_Transfor_oneString_two_another_edit_distance {
     static int editD(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int [][]dp=new int[m+1][n+1];
        //1st col initialize a zero
        for(int i =0;i<=m;i++){
            dp[i][0]=i;
        }
        //2st col initialize a zero
        for(int j =0;j<=n;j++){
            dp[0][j]=j;
        }

        for(int i =1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] =1+ Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
                }
            }
        }
        return  dp[m][n];
    }
    public static void main(String[] args) {
        String a="horse";
        String b ="ros";
        int ans = editD(a,b);
        System.out.println(ans);
    }
}
