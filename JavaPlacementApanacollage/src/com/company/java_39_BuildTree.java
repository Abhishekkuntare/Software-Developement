package com.company;

public class java_39_BuildTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int []nodes){ // return the main root node
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode; // return the root
        }
    }

    public static void main (String[]args){
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

    }
}