package com.company;

interface parentInterface{
    void method1();
    void method2();
}
//for inheritance use the extends key word in interface
interface childInterface extends parentInterface{
    void method3();
    void method4();
}

//b ut we can not use the extends key word to inherit the interfaces
class MyClass implements childInterface{
    @Override
    public void method3(){
        System.out.println("Method3");
    }
    @Override
    public void method4(){
        System.out.println("Method4");
    }
    @Override
    public void method1(){
        System.out.println("Method1");
    }
    @Override
    public void method2(){
        System.out.println("Method2");
    }
}

public class java_25_Inheritance_in_interface {
    public static void main(String[] args) {
        MyClass my = new MyClass();
        my.method1();
        my.method3();
    }
}
