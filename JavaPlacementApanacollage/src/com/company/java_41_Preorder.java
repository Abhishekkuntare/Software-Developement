package com.company;

public class java_41_Preorder {
    static class Node{
        int data;
        java_39_BuildTree.Node left;
        java_39_BuildTree.Node right;
        Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static java_39_BuildTree.Node buildTree(int []nodes){ // return the main root node
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            java_39_BuildTree.Node newNode = new java_39_BuildTree.Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode; // return the root
        }
    }

    //O(n)
    public static void preorder(java_39_BuildTree.Node root) {
        if (root == null) {
            //System.out.print("-1"+" "); print the -1 (optional)
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
        public static void main (String[]args){
            int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            java_39_BuildTree.BinaryTree bt = new java_39_BuildTree.BinaryTree();
            java_39_BuildTree.Node root = java_39_BuildTree.BinaryTree.buildTree(nodes);

            System.out.println("preorder: ");
            preorder(root);

        }
    }