package com.company;

import java.util.ArrayList;
import java.util.List;

class java_07_Next_permutation {
    public static List<Integer> nextPermutation(int[] nums) {
        //step1. find the decreasing sequence starting from end and
        int i = nums.length - 2; //i  = last second index
        while (i >= 0 && nums[i] >= nums[i + 1]) { //run the loop until not get zero means reverse and check
            //the condition last second element and greater than it's next element
            //ex:
            i--; // decreasing the iteration upto 1st element
        }

            //after finding the decreasing element from end
        //2. we have to swap that element with its, next highest element
        if(i>=0){//take that index which we have to swap with next highest element
            int larger = nums.length-1; //take the last element;

            //larger >=0 means we have to check the array bound if not get next highest element then
            // this condition is present to stop the iteration
            while(larger>=0 && nums[larger]<=nums[i]){
                larger--;
            }
            swap(nums,i,larger);
        }

        //3. after swapping remaining array we will arrange in increasing order
        reverse(nums, i + 1);

        List<Integer>li = new ArrayList<>();
        for (int k :nums){
            li.add(k);
        }
        return li;
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

        public static void main (String[]args){
            int [] nums ={1, 2, 3, 6, 5, 4};
            List<Integer> ans;
            ans =nextPermutation(nums);
            for(int i:ans){
                System.out.print(i+" ");
            }
        }
}