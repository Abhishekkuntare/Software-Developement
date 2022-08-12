package com.company;
import java.util.ArrayList;

public class java_30_Stack_ArrayList {
     static class Stack{

    static ArrayList<Integer>list= new ArrayList<>();

    public static boolean isEmpty(){
        return list.size() == 0;
    }

    public static void push(int data){
        list.add(data);
    }

    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size() -1);
        list.remove(list.size()-1);
        return top;
    }

    public static int peek(){ // peek means get top value
        if(isEmpty()){
            return -1;
        }
        return list.size() -1;
    }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        Stack.push(3);
        Stack.push(2);
        Stack.push(1);

        while(!Stack.isEmpty()){//jab tak empty nahi ho jata
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
