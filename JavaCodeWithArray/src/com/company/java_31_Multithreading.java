package com.company;

class MyThread extends Thread{
    @Override
    public void run(){ // we can override the run method from thread
        while(true){
            System.out.println("I am typing....");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){ // we can override the run method from thread
        while(true){
            System.out.println("I am Solving cube....");
        }
    }
}

public class java_31_Multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start(); // calling the method with the help of start key word
        t2.start();
    }
}
