package com.company;

import java.util.Scanner;

public class java_27_space_optimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b =sc.nextInt();

        int size = Math.abs(b-a)+1;
        int arr[] = new int[size];

        for(int i=a;i<=b;i++){
            if(i%2==0 || i%5==0){
                arr[i-a]=1;
            }
        }

        for(int i =a;i<=b;i++){
            if(arr[i-a]==1){
                System.out.print(i+" ");
            }

        }
    }
}
