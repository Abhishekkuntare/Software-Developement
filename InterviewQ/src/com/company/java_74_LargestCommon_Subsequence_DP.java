package com.company;

public class java_74_LargestCommon_Subsequence_DP {
    static int lsc(int m,int n,String a , String b){

        int [][]dp = new int[m+1][n+1];

//        for(int i=1;i<=m;i++){
//            for(int j=1;j<=n;j++){
//                dp[i][j] =-1;//initially we store by -1
//            }
//        }
        return lcsUtil(m,n,a,b,dp);
//        return lcsUtilDP(m,n,a,b,dp);

    }

    //main logic With dp and recursive Time Com n*m;
    /*
    static int lcsUtilDP(int m,int n,String a,String b,int [][]dp){
        if(m==0 || n==0)return 0;//String passes null

        if(dp[m][n]!=-1){ // if the Strings are already present int dp then return here not go for further calls
        return dp[m][n];
    }
        if(a.charAt(m-1)==b.charAt(n-1)){
            dp[m][n] = 1+lcsUtilDP(m-1,n-1,a,b,dp);
            return dp[m][n];
        }else{
            dp[m][n]= Math.max(lcsUtilDP(m-1,n,a,b,dp),lcsUtilDP(m,n-1,a,b,dp));
            return dp[m][n];
        }
    }
*/
    //without DP Timecom 2^n
    /*
    static int lcsUtil(int m,int n,String a ,String b){
        if(m==0 || n==0)return 0;

        if(a.charAt(m-1)==b.charAt(n-1)){// we check only last char
            return 1+lcsUtil(m-1,n-1,a,b); // same then call recursively
        }
        else { // if not match then call for n-1 seprate and m-1 seprate with recursively
            return Math.max(lcsUtil(m,n-1,a,b),lcsUtil(m-1,n,a,b));
        }
    }
    */


    // with dp and for loop only
    static int lcsUtil(int m,int n,String a, String b ,int [][]dp){
            for(int i=1;i<=m;i++){ // for rows
                for(int j=1;j<=n;j++){
                    if(a.charAt(i-1)==b.charAt(j-1)){ // check from the last only
                        dp[i][j] = (dp[i-1][j-1])+1; // then decrease both i and j
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); // simultaneously decrease i and j
                    }
                }
            }
            return dp[m][n];
    }
    public static void main(String[] args) {
        int ans = lsc(3,3,"ABB","ACB");
        System.out.println(ans);
    }
}
