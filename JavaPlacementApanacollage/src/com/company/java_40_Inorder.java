package com.company;

public class java_40_Inorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
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
            new_node.left=buildTree(nodes);
            new_node.right=buildTree(nodes);
            return new_node;
        }

        public static void Inorder(Node root){
            if(root ==null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);//it will give's the root node
        System.out.println(root.data);
        System.out.println("Inorder: ");
        BinaryTree.Inorder(root);

    }
}
