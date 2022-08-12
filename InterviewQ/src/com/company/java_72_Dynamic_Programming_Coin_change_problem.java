package com.company;

import java.util.Arrays;

public class java_72_Dynamic_Programming_Coin_change_problem {
    // with out dynamic programming
//    static int minCoins(int n,int []a){
//        if(n ==0){ // if number =0
//            return 0;
//        }
//        int ans = Integer.MAX_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(n-a[i]>=0) { // because ex: if n =6 and a[i]=7 and you do
//                // 6-7 = -1, so we get -1 that is not possible
//            int subAns = minCoins(n-a[i],a);// calling its sub problem with recursive
//                if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
//                    ans = subAns+1;
//                }
//            }
//        }
//        return ans;
//    }
    // with dynamic programming
    static int minCoins(int n,int a[] ,int []dp){
        if (n==0)return 0;
        int ans =Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(n-a[i]>=0){
                int subAns=0;
                if(dp[n-a[i]]!=-1){ // in the dp array -1 is not present
                    subAns = dp[n-a[i]];
                }else{
                    subAns = minCoins(n-a[i],a,dp);
                }
                if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                    ans = subAns+1;
                }
            }
        }
        dp[n]=ans;
        return ans;
    }
    public static void main(String[] args) {
    int n =18;
    int []a = {7,5,1};
    int []dp = new int[n+1];//create a dp array initialize -1
        Arrays.fill(dp,-1);// initialize with -1
        dp[0] =0;
      int ans = minCoins(n,a,dp);
        System.out.println("Minimum coins to make 18 is: "+ans);

        for(int ab: dp){
            System.out.print(ab+" ");
        }
    }
}

