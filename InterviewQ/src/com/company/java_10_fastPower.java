package com.company;

public class java_10_fastPower {
    public static long fastPower(long a,long b,int n){
        long res =1;
         while(b>0){
          if((b&1)!=0){
              res = ((res * a %n) %n);
          }
          a = (a % n * a % n)%n;
          b = b>>1; // means divide by 2;
      }
        return res;
    }
    public static void main(String[] args) {
        System.out.println( fastPower(3978432,5,1000000007));;
        //a- be the number
        //b- is the power
        //n- is the range
    }
}
