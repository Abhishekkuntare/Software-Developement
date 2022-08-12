package com.company;

import java.util.Arrays;

public class java_08_Sieve_of_Eratosthenes {
    public static boolean[] sieve_of_era(int n){
        boolean []isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i*i<=n;i++){ // multiplier means 2
            for(int j=2*i;j<=n;j+=i){ // multiple 4,6,8
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
    public static void main(String[]args){
        boolean[]isprime = sieve_of_era(30);
        for(int i =0;i<=20;i++){
            if(isprime[i]){
                System.out.print(" "+i);
            }
        }
      //  prime(10);
    }
}