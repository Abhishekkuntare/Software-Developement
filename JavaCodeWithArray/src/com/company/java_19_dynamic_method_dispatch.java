package com.company;

class Phone{
  public void on(){
      System.out.println("Turning of phone");
  }
}

class SmartPhone extends Phone{
    @Override
public void on(){
    System.out.println("Turing of Smartphone......");
}

}

public class java_19_dynamic_method_dispatch {
    public static void main(String[] args) {
       // Phone p = new Phone();
       // SmartPhone s = new SmartPhone(); // object will create in run time
        Phone obj = new SmartPhone(); // dynamic run access dispatch
        //SmartPhone obj = new Phone();//this is not allowed
        obj.on();

    }

}
