package com.company;

import java.util.Scanner;

public class java_05_ReverseBit_BinaryDigit {
    public static int reverseBit(int n){
        int result =0;
        for(int i =0;i<31;i++){
            int lsb= (n&1);
            int reverseLsb = lsb>>(31-i);
            result = result | reverseLsb;
            n = n>>1;
        }
        return result;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bit: ");
        int  n = sc.nextInt();
        System.out.println(reverseBit(n));

    }
}
