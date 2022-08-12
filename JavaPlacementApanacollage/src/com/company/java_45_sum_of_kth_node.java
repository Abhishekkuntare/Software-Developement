package com.company;
import java.util.*;
  public class java_45_sum_of_kth_node {
        static class node {
            int data;
            node left;
            node right;
        };
        static node newNode(int data)
        {
            node temp = new node();
            temp.data = data;
            temp.left = null;
            temp.right = null;
            return temp;
        };
        static int sumofkth(node root,int k){
            Queue<node>q = new LinkedList<>();
            q.add(root);
            int level =0,flag=0,sum=0;
            while(!q.isEmpty()){
                int size = q.size();
                while(size-- >0){
                    node ptr = q.peek();
                    q.remove();

                    if(level==k){
                        flag=1;
                        sum+=ptr.data;
                    }else{
                        if(ptr.left!=null){
                            q.add(ptr.left);
                        }
                        if(ptr.right!=null){
                            q.add(ptr.right);
                        }
                    }
                }
                level++;
                if(flag==1){
                    break;
                }
            }
            return sum;

        }

        public static void main(String[] args)
        {
            node root = new node();
            root = newNode(50);
            root.left = newNode(30);
            root.right = newNode(70);
            root.left.left = newNode(20);
            root.left.right = newNode(40);
            root.right.left = newNode(60);
            int level = 1;
            int result = sumofkth(root, level);

            // Printing the result
            System.out.print(result);
        }
    }