package com.company;

import java.util.Stack;

public class java_39_nextSmallestElement {
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        int []arr={3,10,5,1,15,10,7,6};

        Stack<Integer>ans = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() &&s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
               ans.push(-1);
            }else{
                ans.push(s.peek());
            }
            s.push(arr[i]);
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(ans.get(i)+" ");
        }
    }
}
