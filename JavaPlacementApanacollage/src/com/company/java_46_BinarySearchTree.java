package com.company;

public class java_46_BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data = val;
        }
    }

    //Insertion
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);//create new node and return the root
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left = insert(root.left,val);
        }
        else{
            //right subtree
            root.right = insert(root.right,val);
        }
        return root;
    }

    //Inorder
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //search
    public static boolean searchBST(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            //left subtree
            return searchBST(root.left,key);
        }
        else if (root.data == key){
            return true;
        }
        else{
            //right subtree
            return searchBST(root.right,key);
        }
    }

    //delete
    public static Node delete(Node root,int val){//return node cause change the node
        if(root.data>val){
            root.left = delete(root.left,val);
        }
        else if (root.data <val){
            root.right = delete(root.right,val);
        }
        else{
            //case:1 no child
            if(root.left == null && root.right==null){
                return null;
            }
            //case:2 a) if left.root null
            if(root.left==null){
                return root.right;
            }
            //case:2 b) if right.root null
            else if (root.right==null){
                return root.left;
            }
            //case 3 inorderSuccessor
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left !=null){
            root= root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int []values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i =0;i<values.length;i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        if(searchBST(root,13)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }

        //no child
        delete(root,4);

        // one child
         delete(root,10);

//        two child
        delete(root,5);
        inorder(root);

    }
}
