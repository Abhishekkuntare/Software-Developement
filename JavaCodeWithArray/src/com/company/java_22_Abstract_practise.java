package com.company;

//with the help of abstract class we have to create the standard and use in every
//child method
abstract class conversation{
    abstract public void bye();
}
class c1 extends conversation{
    @Override
    public void bye(){
        System.out.println("Bye Bye!");
    }
}
class c2 extends conversation{
    @Override
    public void bye(){
        System.out.println("Tata !");
    }
}
class c3 extends conversation{
    @Override
    public void bye(){
        System.out.println("Good Bye");
    }
}

public class java_22_Abstract_practise {
    public static void main(String []args){
    c1 con1 = new c1();
    c2 con2 = new c2();
    c3 con3 = new c3();
    con1.bye();
    con2.bye();
    con3.bye();
    }
}
