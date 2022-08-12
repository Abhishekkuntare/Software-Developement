package com.company;

public class java_42_Postorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
    public static Node buildTree(int []nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node new_node = new Node(nodes[idx]);
        new_node.left = buildTree(nodes);
        new_node.right = buildTree(nodes);
        return new_node;
    }

    public static void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }
    }

    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Postorder: ");
        BinaryTree.Postorder(root);
    }
}
