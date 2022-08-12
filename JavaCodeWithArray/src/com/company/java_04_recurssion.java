package com.company;

public class java_04_recurssion {

    static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    static int fact(int n){
        if(n==1 || n==2) {
            return n-1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fib(5));

        // Given Number N
        int N = 10;
        // Print the first N numbers
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
