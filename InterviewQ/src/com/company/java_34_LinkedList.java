package com.company;
//class Node<T>{
//    T data;
//    Node next;
//    Node(T data){
//        this.data = data;
//    }
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=  data;
        this.next=null;
    }
    public void display(Node head){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    public void  insert(Node head,int data,int pos){
        Node new_node = new Node(data);
        if(pos==0){
            new_node.next =head;
            head = new_node;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        new_node.next =prev.next;
        prev.next = new_node;
    }
    public void delete(Node head,int pos){
        if(pos==0){
            head = head.next;
        }
        Node prev= head;
        for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public Node reverseLL(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next; // save the next node
            curr.next = prev; // break the link
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newNode = reverseRecursive(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newNode;
    }
    public Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean palindrome(Node head){
        if(head==null){// one node is present
            return true;
        }
        Node mid = middle(head);
        Node last = reverseLL(mid.next);
        Node curr = head;
        while(last!=null){
            if(curr.data!=last.data){
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }
}

public class java_34_LinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;
        n1.display(head);

        n1.insert(head,100,1);
        n1.display(head);
        n1.delete(head,0);
        n1.display(head);
       Node newHead= n1.reverseLL(head);
        n1.display(newHead);
        n1.reverseRecursive(head);
        n1.display(newHead);

        System.out.println(n1.palindrome(head));

    }
}
