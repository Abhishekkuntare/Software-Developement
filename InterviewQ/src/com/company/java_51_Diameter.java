package com.company;

import java.util.Scanner;

class nobe{
    int data;
    nobe left,right;
    nobe(int data){
        this.data = data;
    }
}
class diameter{

    public nobe createTree(){
        Scanner sc = new Scanner(System.in);
        nobe root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if(data==-1)return null;

        root= new nobe(data);
        System.out.println("Enter left data for: "+data);
        root.left = createTree();
        System.out.println("Enter right data for: "+data);
        root.right = createTree();
        return root;
    }
    public int ans =0;
    public int diameteroftree(nobe root){
        if(root==null)return 0  ;
        int lh = diameteroftree(root.left); // left height
        int rh = diameteroftree(root.right); //right height
        ans = Math.max(ans,1+lh+rh);
        return 1+Math.max(lh,rh);
    }
}
public class java_51_Diameter {
    public static void main(String[] args) {
        diameter d = new diameter();
        nobe root  =  d.createTree();
        System.out.println(d.diameteroftree(root));
    }
}
