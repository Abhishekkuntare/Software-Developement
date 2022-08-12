package com.company;
import java.util.ArrayDeque;
import java.util.Deque;

public class java_40_nextGreaterElement {
    public static void main(String[] args) {
        Deque<Integer> s = new ArrayDeque<>();
        Deque<Integer> ans  = new ArrayDeque<>();
        int []arr={3,10,5,1,15,10,7,6};
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
             ans.push(-1);
            }else{
                ans.push(s.peek());
            }
            s.push(arr[i]);
        }
        while(!ans.isEmpty()){
            System.out.print(ans.peek()+" ");
            ans.pop();
        }
    }
}
