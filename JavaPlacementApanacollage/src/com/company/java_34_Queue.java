package com.company;

public class java_34_Queue{

    static class Queue{
    static int []arr;
    static int rear = -1;
    static int size;

        Queue(int n){
        this.size = n;
        arr = new int[n];
    }
    public static boolean isEmpty(){
            return rear == -1;
    }

    //enqueue
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty ");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        while(!Queue.isEmpty()){
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
