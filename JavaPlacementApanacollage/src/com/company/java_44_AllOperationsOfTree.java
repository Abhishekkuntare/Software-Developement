package com.company;

public class java_44_AllOperationsOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left =null;
            this.right=null;
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

        // no of nodes
        public static int calcNodes(Node root){
            if(root ==null){
                return 0;
            }
            int leftNodes = calcNodes(root.left);
            int rightNodes = calcNodes(root.right);
            return leftNodes+rightNodes+1;

        }

        //sum of nodes
        public static int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftsum = sumOfNodes(root.left);
            int rightsum = sumOfNodes(root.right);
            return leftsum+rightsum+root.data;

        }
        //height of tree
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int leftheight=height(root.left);
            int righthight=height(root.right);
            return Math.max(leftheight,righthight)+1;
        }

        //Diameter of Tree
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left)+height(root.right)+1;// (LH+RH+1)
            return Math.max(diam3,Math.max(diam1,diam2));

        }

        static class TreeInfo{
            int ht;
            int diam;
            TreeInfo(int ht,int diam){
                this.ht = ht;
                this.diam = diam;
            }
        }
        public static TreeInfo diameter2(Node root){
                    if(root==null){
                        return new TreeInfo(0,0);
                    }
                TreeInfo left = diameter2(root.left);
                TreeInfo right = diameter2(root.right);
                int myHeight = Math.max(left.ht,right.ht)+1;

                int diam1 = left.diam;
                int diam2=  right.diam;
                int diam3 = left.ht + right.ht + 1;
                int myDiam = Math.max(Math.max(diam1,diam2), diam3);

                TreeInfo myInfo = new TreeInfo(myHeight,myDiam);
                return myInfo;
        }
    }

    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);

        System.out.println("NO.of Nodes: "+BinaryTree.calcNodes(root));
        System.out.println("Sum of nodes: "+BinaryTree.sumOfNodes(root));
        System.out.println("Height of node: "+BinaryTree.height(root));
        System.out.println("Diameter of tree: "+BinaryTree.diameter(root));
        System.out.println("O(N) Apporach of Diameter: "+BinaryTree.diameter2(root).diam);
    }
}
