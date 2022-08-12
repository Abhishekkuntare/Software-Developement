package com.company;


public class java_27_ReverseLinkList {
    Node head;
    private int size;
java_27_ReverseLinkList(){
    this.size = 0;
}

    class Node{
        int data;
         Node next;
        Node(int data){
        this.data = data;
        this.next = null;
        size++;
        }
    }

    public void addFirst(int data){
        Node new_node = new Node(data);
        if(head ==null){
            head = new_node;
            return;
        }
        new_node.next  =head;
        head = new_node;
    }
    public void addLast(int data){
        Node new_node = new Node(data);
        if(head ==null){
            head = new_node;
            return;
        }
        Node ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }
        ptr.next = new_node;
    }

    public void printll(){
        if(head==null){
            System.out.println("Linked list is empty!");
            return;
        }
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.print("null");
    }

    public int getSize(){
        return size;
    }


//1.Itrative way for reverse linked list'
    public void reverseLinkedList(){
        if(head ==null || head.next ==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode  !=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode; // cause with that time current node will be cross their
    }


    //2.Recursive way for reverse the Linked list
 public Node reverseRecursive(Node head){
if(head == null || head.next==null){
    return head;
}
    Node newHead = reverseRecursive(head.next);
    head.next.next= head;
    head.next =null;
    return newHead;
 }

    public static void main(String[] args) {
        java_27_ReverseLinkList rll = new java_27_ReverseLinkList();
        rll.addLast(1);
        rll.addLast(2);
        rll.addLast(3);
        rll.addLast(4);
        System.out.println(rll.getSize());
        rll.printll();
        rll.reverseLinkedList();
      //  rll.head = rll.reverseRecursive(rll.head);
        System.out.println();
        rll.printll();
    }
}
