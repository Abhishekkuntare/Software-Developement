package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

class nope{

    int data;
    nope next;
    nope child;
    nope(int data){
        this.data = data;
        this.next = null;
        this.child = null;
    }

    //O(N) TC
    public void flattenLinkedList(nope head){
        if(head==null){
            return ;
        }
        nope temp =null;

        //Find the last node in first level in linked list;
        nope last = head;
        while(last.next!=null){
            last = last.next;
        }

        //one by one traverse through all nodes of first level LL till we rich the
        // last node
        nope curr = head;
        while(curr!=last){

            //if current node has child
            if(curr.child!=null){
                //appened the child at the end of the current node
                last.next = curr.child;

                //and update the last to new last node
                temp = curr.child;
                while(temp.next!=null){temp =temp.next;
                }
                last = temp;
            }
            //change the currrent node
            curr = curr.next;
        }

    }
    //O(N) SC
 public nope flattenList(nope head){
     nope curr =head;
     Queue<nope>q =new  ArrayDeque<>();

     //Process all nopes
     while(curr!=null){
         //last nope rich
         if(curr.next==null){
             //deque front nope and set next nope of the curr nope
             curr.next = q.poll();
         }
         //if curr nope has child then add into the queue
         if(curr.child!=null){
             q.add(curr.child);
         }

         //next nope travel
         curr = curr.next;
     }
     return head;
 }
 public void printoriginalLL(nope head){
        if(head==null){
            return;
        }
     System.out.print(" " + head.data + " ");
   if(head.child!=null){
       System.out.print("[");
       printoriginalLL(head.child);
       System.out.print("]");
   }
     printoriginalLL(head.next);
 }
    public void printFlattenedList(nope head){
        while(head!=null){
            System.out.print(head.data+"-->");
            head = head.next;
        }
        System.out.println("null");
    }
}
public class java_46_Flattern_a_multiple_LL {
    public static void main(String[] args) {
        nope one = new nope(1);
        nope two = new nope(2);
        nope three = new nope(3);
        nope four = new nope(4);
        nope five = new nope(5);
        nope six = new nope(6);
        nope seven = new nope(7);
        nope eight = new nope(8);
        nope nine = new nope(9);
        nope ten = new nope(10);
        nope eleven = new nope(11);
        nope twelve = new nope(12);
        nope thirteen = new nope(13);
        nope fourteen = new nope(14);
        nope fifteen = new nope(15);

        // set head node
        nope head = one;
        nope n=new nope(1);
        // set next pointers
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;

        // set child pointers
        one.child = two;
        two.child = three;
        four.child = five;
        five.child = six;
        six.child = seven;
        ten.child = eleven;
        eleven.child = twelve;
        System.out.println("Print the original linklist: ");
       head.printoriginalLL(head);

        head =head.flattenList(head);
        System.out.println("\n\nThe flattened list is :");
        head.printFlattenedList(head);


    }
}
