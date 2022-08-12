package com.company;

public class java_09_GretestCommonDiviser {
    public static int gcd(int a ,int b){
        if(b==0){
            return a;
        }
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a =50,b=10;
        System.out.println(gcd(a,b));;
    }
}
