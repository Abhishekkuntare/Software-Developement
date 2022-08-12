package com.company;
//        The static keyword in Java is used for memory management mainly.
//        We can apply static keyword with variables, methods,
//        blocks and nested classes.

public class java_29_Stack_LinkedList {
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    static class Stack{
//        public static Node head;
//
//        //isEmpty
//        public static boolean isEmpty(){
//            return head == null;
//        }
//
//        //push
//        public static void push(int data){
//            Node new_node = new Node(data);
//            if(isEmpty()){
//                head = new_node;
//                return;
//            }
//            new_node.next =head;
//            head  = new_node;
//        }
//
//        //pop
//        public static int pop(){
//            if(isEmpty()){
//                return -1;
//            }
//            int top = head.data;
//            head = head.next;
//            return top;
//        }
//
//        //peek means give's the top value
//        public static int peek(){
//            if(isEmpty()){
//                return -1;
//            }
//            return head.data;
//        }
//    }

    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(String data){
            Node new_node = new Node(data);
            if(isEmpty()){
                head = new_node;
                return;
            }
            new_node.next = head;
            head = new_node;
        }

        public static String pop(){
            if(isEmpty()){
                return "null";
            }
            String top = head.data;
            head = head.next;
            return top;
        }

        public static String peek(){ // peek means give's the topmost value
            if(isEmpty()){
                return "null";
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
           Stack s = new Stack();
           Stack.push("AB");
           Stack.push("hi");
           Stack.push("sh");
           Stack.push("ek");

           while(!Stack.isEmpty()){
               System.out.println(Stack.peek());
               Stack.pop();
           }
            }
}
