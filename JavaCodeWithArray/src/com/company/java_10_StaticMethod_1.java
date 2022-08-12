package com.company;

public class java_10_StaticMethod_1 {

    static void harray (){
        System.out.println("Empty value of this func");
    }

    static int add_to_number(int x, int y){ // static use for we will use
        // the function without creating the object of the class
        return Math.min(x, y);
    }

    public static void main(String[] args) {
    int x = 10,y =2;
        System.out.println(add_to_number(x,y));
        harray();
    }
}
