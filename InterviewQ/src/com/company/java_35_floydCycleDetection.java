package com.company;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
    public static void display(Node1 head){
        if(head==null){
            return;
        }
        Node1 ptr= head;
        while(ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr= ptr.next;
        }
        System.out.print("null");
    }
    public static void insert(Node1 head,int data,int pos){
        Node1 newNode = new Node1(data);
        if(pos==0){
        newNode.next = head;
        head =newNode;
        }
        Node1 prev =head;
        for(int i=0;i<pos-1;i++){
          prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }
        public static void makeCycle(Node1 head,int pos){
        Node1 temp = head;
        Node1 startNode = null;

        int count =1;
        while(temp.next!=null){
            if(count==pos){
                startNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next= startNode;
        }
    public static Node1 cycleStartPoint(Node1 head){
        Node1 curr =head;
        Node1 meet = detectTheCycle(head);
        while(curr!=meet ){
            curr = curr.next;
            meet = meet.next;
        }
        return curr;
    }
        public static Node1 detectTheCycle(Node1 head){
        Node1 slow = head;
        Node1 fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
        }
}
public class java_35_floydCycleDetection {
    public static void main(String[] args) {
        Node1 n1 = new Node1(10);
        Node1 n2 = new Node1(20);
        Node1 n3 = new Node1(30);
        Node1 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        Node1.display(head);
        System.out.println();
        Node1.insert(head,40,3);
        Node1.display(head);
        System.out.println();
        Node1.makeCycle(head,4);

        System.out.println(Node1.detectTheCycle(head));
        System.out.println(Node1.cycleStartPoint(head));


    }
}
