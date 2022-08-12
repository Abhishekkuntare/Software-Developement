package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class java_32_kthLargestElement {
    public static void main(String[] args) {
        int []arr ={20,10,60,30,50,40};
        int n = arr.length;
        int k =2;
        PriorityQueue<Integer>pq = new PriorityQueue<>(); // by Default minHeap
        PriorityQueue<Integer>p = new PriorityQueue<>(Collections.reverseOrder());//max heap
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i =k;i<n;i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());

//        k'th smallest element
        for(int i=0;i<k;i++){
            p.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(p.peek()>arr[i]){
                p.poll();
                p.add(arr[i]);
            }
        }
        System.out.println(p.peek());
    }
}
//class Solution {
//
//    public int findKthLargest(int[] nums, int k) {
//        quicksort(nums,0,nums.length-1);
//        return nums[nums.length - k ];
//    }
//
//    public int partition(int []nums,int lb,int ub ){
//        int pivot=nums[ub],i=lb-1;
//        for(int j=lb;j<ub;j++){
//            if(nums[j]<pivot){
//                i++;
//                int temp = nums[i];
//                nums[i]= nums[j];
//                nums[j] = temp;
//            }
//        }
//        i++;
//        int temp =nums[i];
//        nums[i] = nums[ub];
//        nums[ub]= temp;
//        return i;
//    }
//
//    public void quicksort(int []nums,int lb,int ub){
//        if(lb<ub){
//            int loc = partition(nums,lb,ub);
//            quicksort(nums,lb,loc-1);
//            quicksort(nums,loc+1,ub);
//        }