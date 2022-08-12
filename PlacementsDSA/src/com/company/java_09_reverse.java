package com.company;

public class java_09_reverse {
    public static void reverse(String str) {
if(str.length() ==0){
    return;
}
        String newString = str.substring(1);
        reverse(newString);
        System.out.print(str.charAt(0));
    }
    public static void main(String []args){
String str ="DATA";
reverse(str);
    }
}
