package com.company;

import java.util.Scanner;

public class java_04_ReverseBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        boolean flag = false;
        int rev = 0;
        int j = 0;
        for (int i = 31; i >= 0; i--) {
            int mask = (1 << i);
            if (flag) {
                if ((n & mask) != 0) {
                    System.out.print(1 + " ");
                    int smask = (1 << j);
                    rev = rev | smask;
                } else {
                    System.out.print(0 + " ");
                }
                j++;
            } else {
                if ((n & mask) != 0) {
                    flag = true;
                    System.out.print(1 + " ");
                    int smask = (1 << j);
                    rev = rev | smask;
                    j++;
                }
            }
        }
        System.out.println();
        System.out.print(rev + " ");


    }
}
