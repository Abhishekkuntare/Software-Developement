package com.company;

import java.util.Scanner;

public class java_09_Static_Method_Without_2 {

    String  logic (String name){
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String str = sc.nextLine();
        String str1 = sc.nextLine();

//        method creation using Object Creation
        java_09_Static_Method_Without_2 obj = new java_09_Static_Method_Without_2();
        java_09_Static_Method_Without_2 obj1 = new java_09_Static_Method_Without_2();

        System.out.println(obj.logic(str));
        System.out.println(obj1.logic(str1));
    }
}
