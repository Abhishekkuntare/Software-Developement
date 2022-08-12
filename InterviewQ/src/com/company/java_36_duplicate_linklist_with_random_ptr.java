package com.company;

class nodeeeee{
    int data;
    nodeeeee next;
    nodeeeee random;
    nodeeeee(int data){
        this.data = data;
        this.next  = null;
    }

    public void display(nodeeeee head){
        nodeeeee ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr= ptr.next;
        }
        System.out.print("null");
    }
    public nodeeeee inserting_new_nodes(nodeeeee head){
        nodeeeee curr= head;
        while(curr!=null){
            nodeeeee temp = curr.next;//save the next node
            curr.next =new nodeeeee(curr.data);
            curr.next.next = temp;
            curr = temp;
        }
        curr =head;

        //setting random pointers of newNode
        while(curr!=null){
            if(curr.next!=null){
            curr.next.random = (curr.random!=null)?curr.random.next:null;
            }
            curr =curr.next.next;
        }

        //seprating both linked list;
        nodeeeee org = head;
        nodeeeee copy = head.next;
        nodeeeee temp =copy;
        while(org!=null){
            org.next = org.next.next;
            copy.next = copy.next.next;
            org = org.next;
            copy = copy.next;
        }
        return  temp;
    }


}

public class java_36_duplicate_linklist_with_random_ptr {
    public static void main(String[] args) {
        nodeeeee n = new nodeeeee(1);
        nodeeeee n1 =new nodeeeee(2);
        nodeeeee n2=new nodeeeee(3);
        nodeeeee head =n;
           n.next =n1;
           n1.next =n2;
           n2.next =null;
             n.display(n);
            n.inserting_new_nodes(head);
            n.display(n);
        }
}
