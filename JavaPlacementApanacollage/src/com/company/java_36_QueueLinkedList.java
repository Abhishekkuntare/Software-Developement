package com.company;

public class java_36_QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
        static class Queue{
            static Node head = null;
            static Node tail =null;
            public static boolean isEmpty(){
                return head==null && tail ==null;
            }
            public static void add(int data){
                Node newNode = new Node(data);
                //only one node present
                if(tail==null){
                    tail = head = newNode;return;
                }
                tail.next = newNode;
                tail = newNode;
            }
            public static int remove(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int front =head.data;
                if(head ==tail){
                    tail=null;
                }
                head  = head.next;
                return front;
            }
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }return head.data;
            }
        }
    public static void main(String[] args) {
        Queue q = new Queue();
        Queue.add(3);
        Queue.add(6);
        Queue.add(9);
        System.out.println(Queue.peek());
        Queue.remove();
        System.out.println( Queue.peek());
    }
}
