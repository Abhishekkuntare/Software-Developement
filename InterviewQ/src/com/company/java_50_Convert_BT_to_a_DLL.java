package com.company;

import java.util.Scanner;

class code{
    int data;
    code right,left;
    code(int data){
        this.data = data;
    }
}
class BinarayTreeToDLL{

    public code createTree(){
        Scanner sc = new Scanner(System.in);
        code root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if(data==-1)return null;

        root= new code(data);
        System.out.println("Enter left data for: "+data);
        root.left = createTree();
        System.out.println("Enter right data for: "+data);
        root.right = createTree();
        return root;
    }

    //similar to the inorder only use prev and head
    code prev=null,head=null;
    public void convertBT_To_DLL(code root){
        if(root==null)return;
        convertBT_To_DLL(root.left);

        if(prev==null) {
            head =root;
        }else{
            root.left = prev;
            prev.right=root;
        }
        prev = root;
        convertBT_To_DLL(root.right);
    }
}


public class java_50_Convert_BT_to_a_DLL {
    public static void main(String[] args) {
    BinarayTreeToDLL btd = new BinarayTreeToDLL();
        code root =new code(0);
        btd.createTree();
        btd.convertBT_To_DLL(root);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
    }
}
