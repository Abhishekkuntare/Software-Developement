package com.company;

class Thread_priorities extends Thread{
    public Thread_priorities(String name){
        super(name);// super used because the thread has passes the parameter
    }
    public void run(){
        while(true){
            System.out.println("The name of threads: "+ getName());
        }
    }
}

public class java_33_Thread_Priorites {
    public static void main(String[] args) {
        Thread_priorities tp1 = new Thread_priorities("Abhishek");
        Thread_priorities tp2 = new Thread_priorities("Aniket");
        Thread_priorities tp3 = new Thread_priorities("Pravin..................");
        tp3.setPriority(Thread.MAX_PRIORITY);
        tp1.setPriority(Thread.MIN_PRIORITY);
        tp1.start();
        tp2.start();
        tp3.start();
    }
}
