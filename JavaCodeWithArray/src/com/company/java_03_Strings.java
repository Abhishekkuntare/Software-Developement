package com.company;

import java.util.Scanner;

public class java_03_Strings {
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("name:" + name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim ());
        System.out.println(name.substring(0,2));
        System.out.println(name.substring(1));
        System.out.println(name.replace('A', 'B'));
        System.out.println(name.replace("Abhi", "Google"));
        System.out.println(name.startsWith("Abhi"));
        System.out.println(name.endsWith("shek"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("A"));
        System.out.println(name.indexOf("A", 2));
        System.out.println(name.lastIndexOf("gle",6)); //Googlegle
//       must use this to compare the String
        System.out.println(name.equals("Abhishek"));
        System.out.println(name.equalsIgnoreCase("Abhishek"));

        String text = "To the Power";
        text  = text.replace(" ","_");
        System.out.println(text);
    }
}
