package com.company;

public class java_11_Recursion {
    public static int joseph(int n,int k){
        if(n==1){
            return 0;
        }
        return (joseph(n-1,k)+k)%n;
    }

    public static int n_m_ways(int n,int m ){
        if(n==1 || m==1){
            return 1;
        }
        return n_m_ways(n-1,m)+n_m_ways(n,m-1);
    }

    public static int power(int a,int b) {
        if(b==0){
            return 1;
         }

        return (power(a,b-1)*a);
    }
    public static void hello(int n){
        if(n==0){
            return;
        }
        System.out.println("hello");
         hello( n-1);

    }
    public static void main(String[] args) {
      //  hello(4);
        System.out.println(power(2,3));
        System.out.println(n_m_ways(4,3));
        System.out.println(joseph(6,5));
    }

}
