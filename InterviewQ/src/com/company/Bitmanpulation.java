package com.company;

import java.util.Scanner;

class bitOperations{
 public int pos = 1;
 public int n =5;
 public int bitMask = 1<<pos;

 public void getBit(){
     int and =n&bitMask;
     if(and!=0) System.out.println("get the "+pos+"pos: "+ 1);
     else System.out.println("get the "+pos+"pos: "+ 0);
 }
 public void setBit(){
     int ans = n^bitMask;
     System.out.println("After set 1 ans: "+ans);
 }
 public void clearBit(){
     int not = ~bitMask;
     int ans = n&not;
     System.out.println("After clear bit: "+ans);
 }
public void updateBit(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter 0 or 1: ");
    int operation = sc.nextInt();
    if(operation ==0){
        int newMask =~bitMask;
        int newNumber = newMask & n;
        System.out.println("After Clear bit: "+newNumber);
    }else{
        int ans= bitMask|n;
        System.out.println("After clear bit: "+ans);
    }
}
}
public class Bitmanpulation {
    static int invertBits(int n)
    {
        int x = (int)(Math.log(n) / Math.log(2)) ;
        int m = 1 << x;
        m = m | m - 1;
        n = n ^ m;
        return n;

}
    public static void main(String[] args) {
//        int a = 4;
//        int b =7;
//        if((a&1)==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//        a = a^b;
//        b = a^b;
//        a = a^b;
//        System.out.println(a +  " "+b);
////
//        for(int i =0;i<10;++i){
//            if((i&1)==1){
//                System.out.println(i);
//            }
//        }
//        int x =22;
//        int y = 27;
//        int n = x^y;
//        int i =0;
//     if((n&(n-1))==0){
//
//     }
//
//        System.out.println(n);
//        System.out.println(i);
//        System.out.println(~(5));
        int n = 5;
        //System.out.print(invertBits(n));
        bitOperations b = new bitOperations();
        b.getBit();
        b.setBit();
        b.clearBit();
        b.updateBit();
    }
}
