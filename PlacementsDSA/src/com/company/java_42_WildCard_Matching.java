package com.company;

public class java_42_WildCard_Matching {
    public static boolean solution(String str,String pattern) {
        boolean[][] dp = new boolean[pattern.length() + 1][str.length() + 1];
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (i == dp.length - 1 && j == dp[0].length - 1) {
                    dp[i][j] = true;
                } else if (i == dp.length - 1) {
                    dp[i][j] = false;
                } else if (j == dp[0].length - 1) {
                    if (pattern.charAt(i) == '*') {
                        dp[i][j] = dp[i + 1][j];
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if (pattern.charAt(i) == '?') {
                        dp[i][j] = dp[i + 1][j + 1];
                    } else if (pattern.charAt(i) == '*') {
                        dp[i][j] = dp[i + 1][j] || dp[i][j + 1];
                    } else if (pattern.charAt(i) == str.charAt(j)) {
                        dp[i][j] = dp[i + 1][j + 1];
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
            String wild="ge?ks*";
            String pattern="geeksforgeeks";
            boolean ans = solution(wild,pattern);
            System.out.println(ans);
            System.out.println('b'-'a'+1);
    }
}
