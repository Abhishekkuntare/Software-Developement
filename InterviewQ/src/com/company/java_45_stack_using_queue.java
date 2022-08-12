package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class java_45_stack_using_queue {
   static Queue<Integer>q1 = new ArrayDeque<>();
   static Queue<Integer>q2 = new ArrayDeque<>();
    public static void pushed(int data){
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(data);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    public static int poped(){
    int top =q1.remove();
    return top;
    }
    public static int peeked(){
        return q1.peek();
    }

    public static void main(String[] args) {
        pushed(10);
        pushed(20);
        pushed(30);
        System.out.println(peeked());
        System.out.println(poped());
    }
}
