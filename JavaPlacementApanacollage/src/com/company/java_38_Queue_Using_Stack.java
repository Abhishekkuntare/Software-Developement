package com.company;

import java.util.ArrayDeque;
import java.util.Stack;

public class java_38_Queue_Using_Stack {
    static class Queue{
        static Stack<Integer>s1 = new Stack<>();
        static Stack<Integer>s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
           while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is emtpy");
                return -1;
            }return s1.peek();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);
        while(!Queue.isEmpty()){
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
