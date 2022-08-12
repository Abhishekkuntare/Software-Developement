package com.company;

import java.util.Stack;

public class java_44_queue_using_stack {
    static Stack<Integer>s1 = new Stack<>();
    static Stack<Integer>s2 = new Stack<>();

    public static void pushed(int data){
        s1.push(data);
    }
    public static int poped(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }
    public static int peeked(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int top = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return top;
    }
    public static int sizeed(){
        return s1.size();
    }
        public static void main(String[] args) {
       pushed(4);
       pushed(2);
        pushed(1);
         pushed(0);
            System.out.println(peeked());
            System.out.println(poped());
            System.out.println(sizeed());

    }
}
