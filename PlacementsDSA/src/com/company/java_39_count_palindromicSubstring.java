package com.company;

public class java_39_count_palindromicSubstring {
    public static void main(String[] args) {

        String s = "abccbc";
        int n =s.length();
        boolean[][]dp = new boolean[n][n];
        int count =0;
        for(int gap=0;gap<n;gap++){

            for(int i=0,j=gap;j<dp.length;i++,j++){

                if(gap==0){
                    dp[i][j]=true;
                }else if (gap==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }else{
                         dp[i][j]=false;
                    }
                }
                if(dp[i][j]){
                    count++;
                }
            }
        }
        System.out.println("No of palindrome are: "+count);
    }
}
