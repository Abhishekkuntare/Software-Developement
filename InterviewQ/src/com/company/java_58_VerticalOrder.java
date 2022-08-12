package com.company;

import java.util.*;

class lode{
    int data;
    lode left,right;
    lode(int data){
        this.data = data;
    }
}

//horizontal distance
class Pair{
    int hd;
    lode node;
   public Pair(int hd,lode node){
        this.hd = hd;
        this.node = node;
    }
}
class verticalOrderBinaryTree {
    public lode createTree() {
        lode root = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) return null;
        root = new lode(data);

        System.out.println("Enter left data for: " + data);
        root.left = createTree();

        System.out.println("Enter right data for: " + data);
        root.right = createTree();
        return root;
    }
       public ArrayList<Integer>verticalOrderBT(lode root){
        Queue<Pair>q = new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>>map = new TreeMap<>();// treemap because we get sorted elements in map;

           q.add(new Pair(0,root));//add root
//           while(!q.isEmpty()){
//               Pair curr = q.poll();
//               if(map.containsKey(curr.hd)){
//                   map.get(curr.hd).add(curr.node.data);
//               }
//               else{
//                   ArrayList<Integer>temp = new ArrayList<>();
//                   temp.add(curr.node.data);
//                   map.put(curr.hd,temp);
//               }
//               if(curr.node.left!=null){
//                   q.add(new Pair(curr.hd-1,curr.node.left));
//               }
//               if(curr.node.right!=null){
//                   q.add(new Pair(curr.hd+1,curr.node.right));
//               }
//           }
           while(!q.isEmpty()){
               Pair curr = q.poll();// remove the ele
               if(map.containsKey(curr.hd)){
                  map.get(curr.hd).add(curr.node.data);
               }
               else{
                   ArrayList<Integer>temp = new ArrayList<>();
                   temp.add(curr.node.data);
                   map.put(curr.hd, temp);
               }
               if(curr.node.left!=null){
                   q.add(new Pair(curr.hd-1,curr.node.left));
               }
               if(curr.node.right!=null){
                   q.add(new Pair(curr.hd+1,curr.node.right));
               }
           }
            ArrayList<Integer>ans = new ArrayList<>();
           for(Map.Entry<Integer,ArrayList<Integer>>entry:map.entrySet()){
               ans.addAll(entry.getValue());
           }
           return ans;
       }
}

public class java_58_VerticalOrder {
    public static void main(String[] args) {
        verticalOrderBinaryTree vobt =new verticalOrderBinaryTree();

        lode root = vobt.createTree();
        ArrayList<Integer>ans = vobt.verticalOrderBT(root);
        for(int x:ans){
            System.out.print(x+" ");
        }

    }
}
