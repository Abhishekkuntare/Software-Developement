package com.company;

class Thread_meth extends Thread{
    public void run(){
        while(true){
            System.out.println("ddadbf: ");
            try {
                Thread.sleep(10);
            }catch (Exception e){
                    System.out.println("InterruptException");
            }
        }
    }
}

class Thread_meth2 extends Thread{
    public void run(){
        while(true){
            System.out.println("I love you from deep of my heart");
        }
    }
}

public class java_34_Thread_Methods {
    public static void main(String[] args) {
        Thread_meth tm = new Thread_meth();
        Thread_meth2 tm2 = new Thread_meth2();

       // tm.start();
//        try{
//            tm.join();// jab tak t1 end na ho tab tak t2 start
//                     // na ho to join() method use karo
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        tm2.start();

        tm.start();
        tm2.start();

    }
}
