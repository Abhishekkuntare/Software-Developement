package com.company;

import java.util.Stack;
public class java_38_nearestLargestElementFromLeft {
    public static void main(String[] args) {
        System.out.println("find the prev largest left element: ");
        int []arr={4,10,5,8,20,15,3,12};
        Stack<Integer>s = new Stack<>();

      for(int i=0;i<arr.length;i++){
          while(!s.isEmpty() && s.peek()<=arr[i]){
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
