package com.company;

public class java_07_Recursion {
//    public static void fibonacci(int a,int b,int n){
//        if(n==0){
//            return;
//        }
//        int c =a+b;
//        System.out.print(c+" ");
//        fibonacci(b,c,n-1);
//    }
    public static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        return fib(n-1)+fib(n-2);

    }


    public static int factorial(int n ) {
        if(n==1 || n==0){
            return 1;
        }
        return n * (factorial(n-1));
    }
    public static void main(String[] args) {
        int n =2;
        System.out.println(factorial(n));

        int a = 0, b=1, m =7;
        System.out.print(a+" ");
        System.out.print(b+" ");
      //  fibonacci(a, b,m-2); it is give the fib series
        System.out.println(fib(7));
    }
}
