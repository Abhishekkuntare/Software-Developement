package com.company;

class  MyThreadRunnable implements Runnable{
    public void run(){
        while(true){
            System.out.println("I am doing some work.....");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
public void run(){
    while(true){
        System.out.println("I am solving cube....");
    }
}
}

public class java_31_Thread_using_runnable_interface {
    public static void main(String[]args){
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        //bullet1.start(); //we can not directly run the runnable interface
        //bullet2.start();
        //we have to create the new thread for and put the object that we created
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();


    }
}
