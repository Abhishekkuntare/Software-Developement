package com.company;

import java.util.Stack;

public class java_37_nearestSmallestEle {
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        int[] arr = {4,10,5,18,3,12,7};
        //Brute force
//        System.out.print(-1+" ");
//        for(int i=1;i<arr.length;i++){
//            for(int j=i-1;j<i;j++){
//                if(arr[j]<arr[i]){
//                    System.out.print(arr[j]+" ");
//                }else{
//                    System.out.print("-1"+" ");
//                }
//            }
//        }
        // Optimal way
       for(int i=0;i<arr.length;i++){
           while(!s.isEmpty() && s.peek()>=arr[i]){
               s.pop();
           }
           if(s.isEmpty()){
               System.out.print(-1+" ");
           }else{
               System.out.print(s.peek()+" ");
           }
           s.push(arr[i]);
       }


    }
}
