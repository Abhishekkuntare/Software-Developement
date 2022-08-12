package com.company;

public class java_18_Party {
    public static int no_of_ways_party(int n){

        if(n<=1){
            return 1;
        }

        int ways1 = no_of_ways_party(n-1);
        int ways2 = (n-1) * no_of_ways_party(n-2); //here n-1 for ways and n-2 is peoples
        return ways1+ways2;
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println(no_of_ways_party(n));
    }
}
