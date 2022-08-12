package com.company;

import java.util.Scanner;

public class java_03_printBIinary {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i =31;i>=0;i--){
            int mask = (1<<i); // place at 31 index 1 and all other are 0
            if(flag){
                if((n&mask)!=0){ // not zero means one
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            else{
                if((n&mask)!=0){
                    flag = true;
                    System.out.print(1+" ");
                }
            }
        }
    }
}
