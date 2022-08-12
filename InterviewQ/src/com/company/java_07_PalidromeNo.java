package com.company;

import java.util.Scanner;

public class java_07_PalidromeNo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0,temp;
        temp = n;
        while(n>0){
            int rem = n%10;// get the last number in n;
            sum = (sum*10)+rem; //mulitiply by 10 and add the rem;
            n /=10; //get remaining numbers
        }
        if(temp==sum){
            System.out.println("Palidrome");
        }else{
            System.out.println("Not Palidrome");
        }
    }
}
