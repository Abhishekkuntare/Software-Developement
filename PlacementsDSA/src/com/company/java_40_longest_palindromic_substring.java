package com.company;

//with the help of dynamic programing
public class java_40_longest_palindromic_substring {
    public static  String longestPalindrome(String s) {
        boolean [][]dp = new boolean[s.length()][s.length()];
        //gap means their digonals 0,1,2 etc
        StringBuilder str = new StringBuilder();
        for(int gap =0;gap<s.length();gap++){ //every element starts from first row
            for(int i =0,j=gap;j<s.length();i++,j++){ //every element end at last col

                if(gap==0){
                    dp[i][j]=true;
                }
                else if(gap==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;

                    }else{
                        dp[i][j]=false;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j)&& dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                } if(dp[i][j]==true){
//                    System.out.println(s.substring(i,j+1));
                    str = new StringBuilder(s.substring(i, j + 1));
//                    System.out.println(str);
                }
            }

        }
//        System.out.println(str);
        return str.toString();
    }
    public static void main (String[]args){
        String str = "cbbd";
        String ans = longestPalindrome(str);
        System.out.println(ans);
    }
}
