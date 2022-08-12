package com.company;

class MyThreadRunnableConstrctor implements Runnable{
    private final String name2;

    public MyThreadRunnableConstrctor( String name2){
        this.name2 = name2;
    }
    public void run(){

    }
}


class MyThreadConstructor extends Thread{
    public MyThreadConstructor(String name){
        super(name);//why super here? because it has already one constructor who takes
        // the name parameter
    }
    public void run(){
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}

    public class java_32_Thread_Constructor {
        public static void main(String[] args) {
    MyThreadConstructor t1 = new MyThreadConstructor("Abhishek");
    t1.start();
    System.out.println("The id of t1: "+t1.getId()); // getting the id of thread t1
    System.out.println("The name of t1: "+t1.getName()); // getting the name of thread t1

    MyThreadRunnableConstrctor mct = new MyThreadRunnableConstrctor("Aniket");
    Thread mct_shoot = new Thread(mct);
    mct_shoot.start();
    System.out.println("The mct name is: "+mct_shoot.getName());
    System.out.println("The mct id is: "+mct_shoot.getId());
        }
    }
