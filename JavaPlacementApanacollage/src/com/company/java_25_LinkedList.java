package com.company;

class LL{
    Node head; // this is the staring point of ll
    private int size;
    LL(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

        //addFirst
        public void addFirst(String data){
            Node new_node = new Node(data);
            if(head == null){
                head = new_node;
                return;
            }
            new_node.next = head;
            head = new_node;
        }

        //addLast
        public void addLast(String data){
            Node new_node = new Node(data);
            if(head ==null){
                head =new_node;
                return;
            }
            Node ptr = head;//pointed to the head
            while(ptr.next !=null){
                ptr = ptr.next;
            }
            ptr.next = new_node;
        }

        //print
        public void printll(){
            if(head == null){
                System.out.println("Linked list is empty!");
                return;
            }

            Node ptr = head;
            while(ptr!=null){
                System.out.print(ptr.data+"->");
                ptr = ptr.next;
            }
            System.out.print("NULL");
        }

        //delete first node
            public void delFirst(){
                if(head==null){
                    System.out.println("Linked list is empty!");
                    return;
                }
                size--;
                head = head.next;//means head is deleted and new head is it's next pointer
            }

            // delete Last node
                public void delLast(){

                if(head ==null){
                    System.out.println("Linked list is empty!");
                    return;
                }
                    size--;
                if(head.next == null){ // if linked list have only one node
                    head = null;return;
                }

                Node ptr1 = head;
                Node ptr2 = head.next;

                while(ptr2.next!=null){
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                ptr1.next =null;
                }
                public int getSize(){
                    return size;
                }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("ab");
        list.addLast("hi");
        list.addLast("sh");
        list.addLast("ek");
        list.printll();

        System.out.println();
        list.delFirst();
        list.printll();

        System.out.println();
        list.delLast();
        list.printll();

        System.out.println();
        System.out.println("size: "+list.getSize());

    }
}