package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class java_43_LevelOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right= null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int []nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node new_node = new Node(nodes[idx]);//this is use with the help of constructor
            new_node.left=buildTree(nodes);
            new_node.right=buildTree(nodes);
            return new_node;
        }

    public static void LevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){ // loop run's until q is not empty
            Node currNode = q.remove(); // remove the 1st element
            if(currNode==null){  //check is currnode null or not  of not
                System.out.println();  // if null new line print
                if(q.isEmpty()){ // then if q is empty stop the loop
                    break;
                }else{
                    q.add(null); //else add the null end of the q
                }
            }else{
                System.out.print(currNode.data+" "); // if currnode is not null print data
                if(currNode.left !=null){ // call the left side of
                    q.add(currNode.left);
                }
                if(currNode.right !=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void sum_of_kth(Node root,int k){

    }
    }
    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Level Order: ");
        BinaryTree.LevelOrder(root);
    }
}
