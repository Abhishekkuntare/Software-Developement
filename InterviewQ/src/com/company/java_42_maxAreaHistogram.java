package com.company;
import java.util.Stack;

public class java_42_maxAreaHistogram {
    public static int[] prevSmall(int[] arr) {
        int[] ps = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    public static int[] nextSmall(int[] arr) {
        int[] ns = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ns[i] = -1;
            } else {
                ns[i] = s.peek();
            }
            s.push(i);
        }
        return ns;
    }

public static int maxArea(int []arr){
    int maxAns=0;
    int[] prevSmallest = prevSmall(arr);
    int[] nextSmallest = nextSmall(arr);
    for(int i=0;i<arr.length;i++){
        int curr=(prevSmallest[i]-nextSmallest[i]-1)*arr[i];
        maxAns =Math.max(maxAns,curr);
    }
    return maxAns;
}
    public static void main(String[] args) {
    int []arr = {4,2,1,5,6,3,2,4,2};
        System.out.println(maxArea(arr));
    }
}
