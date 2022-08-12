package com.company;

public class java_06_NoOfZeros {
    public static void main(String[] args) {
        int res = 0;
        int n = 20;
        for(int i =5;i<=n;i=i*5){
            res = res +n/i;
        }
        System.out.println(res);
    }
}
