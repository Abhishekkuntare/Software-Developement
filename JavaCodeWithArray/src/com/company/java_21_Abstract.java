package com.company;

//abstract is nothing but the template of methods that we use in classes
// and we override that Method inside class

abstract class parent2{
abstract public void greet();
abstract public void greet2();
}

class child2 extends parent2{
@Override
public void greet(){
    System.out.println("Good night!");
}
@Override
    public void greet2(){
    System.out.println("Good Morning!");
}
}


public class java_21_Abstract {
    public static void main(String[] args) {
       // parent2 p2= new parent2(); // cant do this because we cant create the abstract class object
        child2 c2 = new child2();
        c2.greet();
        c2.greet2();
    }
}
