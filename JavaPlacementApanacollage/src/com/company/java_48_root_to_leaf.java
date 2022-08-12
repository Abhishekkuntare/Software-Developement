package com.company;

import java.util.ArrayList;

public class java_48_root_to_leaf {
    static class node{
        node left;
        node right;
        int data;
        node(int data){
            this.data = data;
        }
    }
    public static node insert (node root,int val){
        if(root==null){
            root = new node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void printPaths(ArrayList<Integer>path){
        for(int i =0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }

    public static void root_to_leaf_paths(node root,ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        //leaf nodes
        if(root.left == null && root.right ==null){
            printPaths(path);
        }
        // non-leaf nodes
        else{
            root_to_leaf_paths(root.left,path);
            root_to_leaf_paths(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int []values = {8,5,3,1,4,6,10,11,14};
        node root = null; // first we insert the null value in tree
        for(int i =0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        root_to_leaf_paths(root,new ArrayList<>());
    }
}
