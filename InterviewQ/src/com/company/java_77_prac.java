package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class java_77_prac {
    public static void main (String []args) {
//        int[] arr = {1,2,3,4,5};
//        int profit=0;
//
//        for(int i=1;i<arr.length;i++){
//          if(arr[i]>arr[i-1]){
//              profit +=arr[i]-arr[i-1];
//          }
//        }
//        System.out.println(profit);
        int  []nums = {1,2,3,4,5,6,7};
        int k =3,n=nums.length;
        ArrayDeque<Integer>q =new ArrayDeque<>();
        for(int i=0;i<n;i++){
            q.add(nums[i]);
        }
        while(k>0){
        q.addFirst(q.peekLast());
        q.pollLast();
        k--;
        }
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }
    }
}
