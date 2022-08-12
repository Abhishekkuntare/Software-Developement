package com.company;

import javax.sound.midi.MidiFileFormat;

public class java_35_CircularQueue {
    static class Queue{
        static int rear =-1;
        static int front = -1;
        static int []arr;
        static int size;
        Queue(int n){
            this.size = n;
            arr=new int[n];
        }
        public static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        public static boolean isFull(){
            return (rear+1) %size == front;
        }
        public static void add (int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // for one element in queue
            if(front ==-1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        public static int remove (){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int item = arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front = (front+1) % size;
            }
            return item;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q= new Queue(4);
        Queue.add(10);
        Queue.add(20);
        Queue.add(30);
        Queue.remove();
        Queue.add(50);
        while(!Queue.isEmpty()){
            System.out.print(Queue.peek()+" ");
            Queue.remove();
        }

    }
}
