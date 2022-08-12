package com.company;

class ThreadPractise extends Thread{
    public void run(){
        while(true){
            System.out.println("Good morning!");
        try{
            Thread.sleep(100);
        }catch (Exception e){
            System.out.println(e);
        }
        }
    }
}

class ThreadPractise2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome!");
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
