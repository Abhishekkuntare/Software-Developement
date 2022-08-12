package com.company;

public class java_07_method_overloading {

    static void foo(){
        System.out.println("Without Parameters");
    }
    static void foo(int a){
        System.out.println("With " + a +" Parameters ");
    }

//    take Parameters
    static void foo(String s,int b){
        System.out.println("With " + s+ b + " Parameters ");
    }


    public static void main(String[] args) {
foo();
foo(2); // arguments passes and arguments are actual
foo("MicroSoft",7); // arguments passes
    }
}
