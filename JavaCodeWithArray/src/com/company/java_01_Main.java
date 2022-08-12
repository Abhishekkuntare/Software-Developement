package com.company;

import java.util.Scanner;

public class java_01_Main {

    public static void main(String[] args) {
System.out.println("Abhihsek pravin kuntare");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
          //  int a = sc.nextInt();
        String str = sc.nextLine();
        System.out.println(str);
            boolean bol = sc.hasNextInt();
            System.out.println(bol);

            String name =sc.nextLine();
            System.out.printf("Your name is %s",name);
    }
}
