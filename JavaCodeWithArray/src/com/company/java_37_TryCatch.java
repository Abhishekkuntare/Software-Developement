package com.company;

public class java_37_TryCatch {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
//        int c = a/b; //Exception in thread "main" java.lang.ArithmeticException: / by zero
//        System.out.println(c);

        try{
            int c = a/b;
            System.out.println("Result: "+c);
        }
        catch (Exception e){
            System.out.println("The reason is: ");
            System.out.println(e);
        }
        System.out.println("End of the program ");
    }
}
