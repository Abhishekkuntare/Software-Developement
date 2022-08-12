package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class java_13_kth_largest_ele {
    static int kthsmallestelem(Integer []arr,int k ){
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<pq.peek()){
                pq.peek();
                pq.add(i);
            }
        }
        return pq.peek();
    }
    public static int kthLargestp(Integer[] arr, int k){
        PriorityQueue<Integer>p = new PriorityQueue<>();
        for(int i =0;i<k;i++){
            p.add(arr[i]);
        }
        for(int i =k;i<arr.length;i++){
            if(p.peek()<arr[i]){
            p.poll();
            p.add(arr[i]);
            }
        }
        return p.peek();
    }
    public static int kthLargest(Integer []arr,int k){
        Arrays.sort(arr, Collections.reverseOrder());

        return arr[k-1];
    }
    public static int kthSmallest(Integer[] arr, int k)
    {
        // Sort the given array
        Arrays.sort(arr);

        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }

    public static void main(String[] args) {
        Integer []arr = {10,21,34,4,5};
        int k = 3;
      //  System.out.println("K'th smallest element is " + kthSmallest(arr, k));
//        System.out.println("K'th Largest Element is "+ kthLargest(arr,k));
        System.out.println("K'th Largest Element is "+ kthLargestp(arr,k));
        System.out.println("K'th Largest Element is "+ kthsmallestelem(arr,k));
    }
}
