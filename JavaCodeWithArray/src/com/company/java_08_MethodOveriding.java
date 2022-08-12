package com.company;

class parent1{
    public void state1(){
        System.out.println("State1 from parent1");
    }
}
class child1 extends parent1{
    @Override
    public void state1(){
        System.out.println("State1 from child1 ");
    }
}

class A{
    public void method1(){
        System.out.println("Method 1  from Class A");
    }
}

class B extends A{
    //method Overriding
    @Override
    public void method1(){
        System.out.println("Method 1 from Class B");
    }
    public void method2(){
        System.out.println("Method 2 from Class B");
    }
}

public class java_08_MethodOveriding {
    public static void main(String[] args) {
    A a = new A();
    a.method1();

    B b = new B();
    //b.method2();
    b.method1();

    parent1 p1 = new parent1();
    child1 c1= new child1();
    c1.state1();
    p1.state1();
    }

}
