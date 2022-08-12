package com.company;

import java.util.Scanner;

class gode{
    int data;
    gode left,right;
    gode(int data){
        this.data = data;
    }
}
class checkBSTOrNOT{
    public gode createTree(){
        gode root = null;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if(data==-1)return null;
        root = new gode(data);

        System.out.println("Enter left data for: "+data);
        root.left = createTree();

        System.out.println("Enter right data for: "+data);
        root.right= createTree();
        return root;
    }

    //1. approch O(H) time comp
    boolean isBST(gode root){
        return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    boolean isBSTUtil(gode node ,int min ,int max){
        if(node ==null)return true;

        if(node.data<min || node.data>max){
            return false;
        }
        return (isBSTUtil(node.left,min,node.data-1))
                &&isBSTUtil(node.right,node.data+1,max);
    }

    //2.second approch // similar to the inorder O(H) time com H is height of tree
    gode prev =null;
    boolean isBSTSecond(gode node){
        if(node!=null){
            //is not left side is satisfy then return false
            if(!isBSTSecond(node.left)){
                return false;
            }
            if(prev!=null && node.data<=prev.data){ // if node data is less than prev data so return false;
                //because we want the prev data is less than node data;
                    return false;
            }
            prev = node;
            //calling for right side
            return isBSTSecond(node.right);
        }
        return true;
    }
}

public class java_55_checkIfATreeIsBSTOrNOt {
    public static void main(String[] args) {
        checkBSTOrNOT bst = new checkBSTOrNOT();
        gode root = bst.createTree();
        System.out.println(  bst.isBSTSecond(root));
    }
}
