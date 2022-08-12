package com.company;
import java.util.*;

class Hashset{
    public void hashset(){
        HashSet<Integer>set = new HashSet();
        set.add(31);
        set.add(33);
        set.add(35);
        set.add(38);
        System.out.println(set);
        System.out.println(set.contains(4));

        set.remove(31);
        set.remove(33);
        System.out.println(set);

        System.out.println(set.size());

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
set.clear();
    }
}

class printRange{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public Node insert(Node root,int val){
        if(root==null){
            root =new Node(val);
            return root;
        }
        if(root.data>val){
            root.left =  insert(root.left,val);
        }else{
            root.right= insert(root.right,val);
        }
        return root;
    }
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void printRange(Node root,int x,int y){
    if(root==null){
        return;
    }
    if(root.data>=x&&root.data<=y){
        printRange(root.left,x,y);
        System.out.print(root.data+" ");
        printRange(root.right,x,y);
    }
    else if(root.data>=y){
        printRange(root.left,x,y);
    }
    else {
        printRange(root.right,x,y);
    }

    }
}

class BST{
class doremon{
    int data;
    doremon left;
    doremon right;
    doremon(int data){
        this.data = data;
    }
}
public doremon insert(doremon root,int data){
    if(root==null){
        root= new doremon(data);
        return root;
    }
    if(root.data>data){
        //left subtree
        root.left = insert(root.left,data);
    }else{
        root.right = insert(root.right,data);
    }
    return root;
}
        public void inorder(doremon root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public boolean search(doremon root,int key){
            if(root ==null){
                return false;
            }
            if(root.data>key){
                //left subtree
                return search(root.left,key);
            }else if(root.data==key){
                return true;
            }
            else{
                return search(root.right,key);
            }
        }
        public doremon delete(doremon root,int val){
                if (root.data>val){
                    //left subtree
                    root.left = delete(root.left,val);
                }
                else if (root.data<val){
                    root.right = delete(root.right,val);
                }
                else{
                    //1.
                    if(root.left==null && root.right ==null){
                        return null;
                    }
                    if(root.left ==null){
                        return root.right;
                    }else if (root.right ==null){
                        return root.left;
                    }
                    else{
                        doremon IS = inorderSuccessor(root.right);//passing the root.right
                        root.data= IS.data;
                        root.right = delete(root.right,IS.data);
                    }
                }return root;
        }
        public doremon inorderSuccessor(doremon root){
            while (root.left!=null){
                root = root.left;
            }
            return root;
        }
}

class binarytreerevison{
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right = null;
        }
    }
    static int idx = -1;
    public Node buildtree(int []nodes){
        idx++;
         if(nodes[idx]==-1){
             return null;
         }
        Node new_node = new Node(nodes[idx]);
         new_node.left= buildtree(nodes);
         new_node.right = buildtree(nodes);
         return new_node;
    }
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelorder(Node root){
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();//current value of node
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){ //after deleting the null check q is empty if empty then break
                    break;
                }else{
                    q.add(null);//after deleting the currnode q is not emtpy then add null
                }
            }
            else{
                //if currNode is not null
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

        public int no_of_nodes (Node root){
            if(root==null){
                return 0;
            }
            int left_nodes = no_of_nodes(root.left);
            int right_nodes = no_of_nodes(root.right);
            return left_nodes+right_nodes+1;
        }

        public int sum_of_nodes(Node root) {
            if (root == null) {
                return 0;
            }
            int sumleft= sum_of_nodes(root.left);
            int sumright = sum_of_nodes(root.right);
            return sumleft+sumright+root.data;
        }

        public int height_of_nodes(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = height_of_nodes(root.left);
        int rightHeight = height_of_nodes(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }

      public int  diameter_of_tree(Node root){
        if(root==null){
            return 0;
        }
        int dim1 = diameter_of_tree(root.left);
        int dim2=diameter_of_tree(root.right);
        int dim3= height_of_nodes(root.left)+height_of_nodes(root.right)+1;
        return Math.max(Math.max(dim1,dim2),dim3);
      }

      class TreeInfo{
        int ht;
        int dim;
        TreeInfo(int ht,int dim){
            this.ht = ht;
            this.dim = dim;
        }
      }
      // find the diameter
    class Tree{
        //initializing the properties
        int ht;
        int dim;

        //creating the constructor
        Tree(int ht,int dim){
            this.ht = ht;
            this.dim = dim;
        }
    }
    public Tree diameter(Node root){ //it will be return the custom data type
        if(root==null){
            return new Tree(0,0);
        }
        //calculate the height of tree;
        Tree left = diameter(root.left);
        Tree right = diameter(root.right);
        int myHeight = Math.max(left.ht, right.ht+ 1);

        //calculate the Diameter of Tree;
        int dim1 = left.dim;
        int dim2 = right.dim;
        int dim3 = left.ht+right.ht+1;
        int myDiameter = Math.max((Math.max(dim1,dim2)),dim3);

        Tree newD = new Tree(myHeight,myDiameter);
        return newD;
    }

}

public class revison {
    public static void pushatbottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(data,s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();// top value store in top and remove it
        reverse(s);
        pushatbottom(top,s);

    }
    static class queueue{
        static int size;
        static int []arr;
        static int rear = -1;
        queueue(int n ){
            this.size = n;
            arr = new int[n];
        }
        public static boolean isEmpty(){
            return rear ==-1;
        }
        public static void enqueue(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public static int dequeue(){
            if(isEmpty()){
            return -1;
            }
            int front = arr[0];
            for(int i =0;i<rear;i++){
                arr[i]=arr[i+1];}
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }

    static class circular_queue{
        static int size;
        static int []arr;
        static int rear = -1;
        static int front = -1;
        circular_queue(int n){
            this.size = n;
            arr = new int[n];
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1) % size==front;
        }
        public static void circularEnque(int data){
            if(isFull()){
                System.out.println("Full ");
                return;
            }
            // has only one element in array of queue
            if(front==-1){
                front = 0;
            }
               // %-->modulo
            rear = (rear+1)%size;
            arr[rear] =data;
        }

        public static int circularDequeue(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int item= arr[front];
            if(rear==front){
                rear=front=-1;
            }else {
                front = (front + 1) % size;
            }
            return item;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }

    static class queue_linkedlist{
        static Node head = null;
        static Node tail = null;
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node new_node = new Node(data);
            if(tail==null){
                tail = head=new_node;
                return;
            }
            tail.next = new_node;
            tail = new_node;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = head.data;
            if(head==tail){
                tail =null;
            }
            head = head.next;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    static class queue_stack{
       static Stack<Integer>s1 = new Stack<>();
       static  Stack<Integer>s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());//insert in s2 stack
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop()); // insert in s1 stack
            }
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = s1.pop();
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        queueue q = new queueue(3);
        queueue.enqueue(22);
        queueue.enqueue(21);
        queueue.enqueue(23);
        while(!queueue.isEmpty()){
            System.out.println(queueue.peek());
            queueue.dequeue();
        }
        circular_queue cq = new circular_queue(4);
        circular_queue.circularEnque(3);
        circular_queue.circularEnque(1);
        circular_queue.circularEnque(4);
        while(!circular_queue.isEmpty()){
            System.out.println(circular_queue.peek());
            circular_queue.circularDequeue();
        }
        queue_linkedlist ql = new queue_linkedlist();
        queue_linkedlist.add(40);
        queue_linkedlist.add(6);
        queue_linkedlist.add(8);
        while(!queue_linkedlist.isEmpty()){
            System.out.println(queue_linkedlist.peek());
            queue_linkedlist.remove();
        }
        queue_stack qs = new queue_stack();
        queue_stack.add(1);
        queue_stack.add(2);
        queue_stack.add(3);
        queue_stack.add(4);
        queue_stack.add(5);
        while(!queue_stack.isEmpty()){
            System.out.println(queue_stack.peek());
            queue_stack.remove();
        }
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytreerevison btr = new binarytreerevison();
        binarytreerevison.Node root = btr.buildtree(nodes);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

        System.out.println();
        btr.inorder(root);
        System.out.println();
        btr.preorder(root);
        System.out.println();
        btr.postorder(root);
        System.out.println();
        btr.levelorder(root);

        System.out.println("No of Nodes: "+btr.no_of_nodes(root));
        System.out.println("Sum of Nodes: "+btr.sum_of_nodes(root));
        System.out.println("Height of Tree: "+btr.height_of_nodes(root));
        System.out.println("Diameter of Tree: "+btr.diameter_of_tree(root));
        System.out.println("Diameter O(N) of Tree: "+btr.diameter(root).dim);

        System.out.println();
        int []values = {8,5,3,1,4,6,10,11,14};
        BST bst = new BST();
        BST.doremon rooter= null;
        for(int i=0;i<values.length;i++){
            rooter = bst.insert(rooter,values[i]);
        }
        bst.inorder(rooter);
        if(bst.search(rooter,99)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
        bst.delete(rooter,4);
        bst.delete(rooter,10);
        bst.delete(rooter,5);
        bst.inorder(rooter);
        System.out.println();
        printRange pr = new printRange();
        printRange.Node rooty = null;
        for(int i =0;i<values.length;i++){
            rooty = pr.insert(rooty,values[i]);
        }
        pr.inorder(rooty);
        System.out.println();
        pr.printRange(rooty,9,11);

        Hashset hash = new Hashset();
        hash.hashset();
    }
}
