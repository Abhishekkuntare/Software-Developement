package com.company;

import java.util.Scanner;

class bode{
    int data;
    bode left,right;
    bode(int data){
        this.data = data;
    }
}
class binarySearchTree{
    public bode createTree(){
        bode root = null;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if(data==-1)return null;
        root = new bode(data);

        System.out.println("Enter left data for: "+data);
        root.left = createTree();

        System.out.println("Enter right data for: "+data);
        root.right= createTree();
        return root;
    }

    public boolean SearchNode(bode root,int key){
        if(root==null)return false;
        if(root.data == key)return true;

        if(root.data>key){ //if root data is greater than key search in left side
        return  SearchNode(root.left,key);
        }
        //root data is less than key search in right side
        return SearchNode(root.right,key);
    }

//    //recursive way O(H) and sc = O(H)
//    public bode insertBST(bode root,int item){
//        if(root==null){
//            return new bode(item);
//        }
//        if(root.data > item){
//            root.left = insertBST(root.left,item);
//        }else if (root.data<item){
//            root.right=insertBST(root.right,item);
//        }
//        return root;
//    }

    //itrative way TC = O(logN) and SC = O(1)
    public bode insertInBST(bode root,int key) {
        bode newNode = new bode(key);//1.create a new node

        //2.initialize the node's
        bode curr = root;
        bode parent = null;

        //3. find the parent
        while(curr!=null){
            parent = curr; // get the parent
            if(key< curr.data){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }

        //4.insert the key with respective parent
        if(parent==null)return null;
        else if (key< parent.data){
            parent.left = newNode;
        }else{
            parent.right = newNode;
        }
        return root;
    }

    //delete the node
    public bode deleteNodeBST(bode root,int key){

        // base condition. if root is null return root;
        if(root==null)return root;

        //1.delete the left side leaf node
        if(key<root.data){
            root.left = deleteNodeBST(root.left,key);
        }

        //2.delete the right side leaf node
        else if (key>root.data){
            root.right = deleteNodeBST(root.right,key);
        }

        else{
            //3.if both left and right are null return null
            if(root.left==null && root.right==null){
                return null;
            }

            //4.if left side null return right
            if (root.left==null){
                return root.right;
            }

            //5.if right side null return left
           else if(root.right==null){
               return root.left;
            }

           //6.if root contain two child then, go to right side and find the min value to replace the current root,
            // that min value present in right side of left most leaf node

            bode min = minvalue(root.right); // store the min value of right side tree

            root.data = min.data; // delete the root data and set  minvalue their

            root.right = deleteNodeBST(root.right, min.data);//After setting minvalue ,
            // delete the min value which is present in right side of left most end
            //because that min value replace with root value

        }
        return root;
    }

    //get the min value of left most side in the tree also called the inorderSuccessor
    public bode minvalue(bode root){
        //loop will run until not get left root null
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }

    // for print the bst
    public void inorder(bode root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}

public class java_54_BinarySearchTree {
    public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree();
        bode root = bst.createTree();

        //Search
        System.out.println( bst.SearchNode(root,20));
        bst.inorder(root);

        System.out.println();

        //Insert
         root = bst.insertInBST(root,4);
         bst.inorder(root);

        System.out.println();

         //Delete
        root = bst.deleteNodeBST(root,2);
        bst.inorder(root);
    }
}
