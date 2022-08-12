package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
class Arraylist{
    public void arraylist(){
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println(list);
        list.add(32);
        list.add(23);
        list.add(10);
        list.add(1660);
        System.out.println(list);
        list.remove(0);// it will be takes the index of remove
        list.remove(1);

        list.size();

        list.set(1,10101);
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
class Linkedlist{
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printLL(){
        if(head==null){
            System.out.println("Linkded list empty");
            return;
        }
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->>");
            ptr = ptr.next;
        }
        System.out.print("null");

    }

    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data){
        Node new_node = new Node(data);
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }
        ptr.next = new_node;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        head = head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node ptr = head;
        Node ptr2 = head.next;
        while(ptr2.next!=null){
            ptr = ptr.next;
            ptr2 = ptr2.next;
        }
        ptr.next = null;
    }
  public Node reverse(Node head){
        if(head==null|| head.next==null){
            return head;
        }
        Node new_node = reverse(head.next);
        head.next.next = head;
        head.next= null;
        return new_node;
  }
}
class StackLinkedlist{
node head;
    static class node {
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next= null;
        }
    }

        public boolean isEmpty(){
            return head==null;
        }

        public void add(int data){
        node new_node = new node(data);
        if(isEmpty()){
            head = new_node;
            return;
        }
        new_node.next = head;
        head= new_node;
        }
        public int remove(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
        }
        public int peek(){
        if(isEmpty()){
            return -1;
        }

        return head.data;
        }
}
public class prack {
    public static void main(String[] args) {

//        Arraylist al = new Arraylist();
//        al.arraylist();

//        Linkedlist ll = new Linkedlist();
//        ll.addFirst(1);
//        ll.addFirst(3);
//        ll.addFirst(5);
////        ll.printLL();/
//        ll.addLast(100);
//        ll.addLast(100);
//        ll.addLast(100);

//        System.out.println();
      //  ll.printLL();
//
//        System.out.println();
//        ll.removeFirst();
//        ll.printLL();
//
//        System.out.println();
//        ll.removeLast();
//        ll.printLL();
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addFirst(3);
//        list.addLast(3);
//        list.addLast(3);
//        System.out.println(list);
//        System.out.println(list.size());
//        list.remove(0);
//        list.removeLast();
//        list.removeFirst();
//        System.out.println(list);
      //  System.out.println();

    //    ll.head = ll.reverse(ll.head);
     //  ll.printLL();
        StackLinkedlist s = new StackLinkedlist();
        s.add(3);
        s.add(4);
        while(s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
    }
}