package com.company;

public class java_34_Thread_practicse {
    public static void main(String[] args) {
        ThreadPractise tp = new ThreadPractise();
        ThreadPractise2 tp2 = new ThreadPractise2();
        tp.setPriority(1);
        tp2.setPriority(10);
        System.out.println(tp.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp.getState());
        System.out.println(tp.getThreadGroup());
        // tp.start();
        System.out.println(tp.getState());
        System.out.println(tp.isDaemon());
        System.out.println(tp.getStackTrace());
        System.out.println(tp.isAlive());
        System.out.println(Thread.currentThread().getState());

        //tp2.start();
    }
}
