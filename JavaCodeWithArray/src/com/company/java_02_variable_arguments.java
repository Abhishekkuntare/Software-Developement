package com.company;

public class java_02_variable_arguments {

//    available as an array
    static int  foo(int ...a){
        int ans = 0;
        for(int element: a){
            ans +=element;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(foo(1,2));
        System.out.println(foo(1,2,5));
        System.out.println(foo(1,2,5,7));
    }
}
