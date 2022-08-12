package com.company;

import java.util.Scanner;

public class java_15_kthLargestElement {

    public static int partition(int []nums,int lb,int ub ){
        int pivot=nums[ub],i=lb-1;
        for(int j=lb;j<ub;j++){
            if(nums[j]<pivot){
                i++;
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j] = temp;
            }
        }
        i++;
        int temp =nums[i];
        nums[i] = nums[ub];
        nums[ub]= temp;
        return i;
    }

    public static void quicksort(int []nums,int lb,int ub){
        if(lb<ub){
            int loc = partition(nums,lb,ub);
            quicksort(nums,lb,loc-1);
            quicksort(nums,loc+1,ub);
        }
    }

    public static int kth_ele(int []nums,int k){
        quicksort(nums,0,nums.length-1);
        System.out.println(nums[nums.length - k ]);
        return nums[nums.length - k ];

    }
    public static void main(String[] args) {
        int []nums = {3,2,3,1,2,4,5,5,6};
        int len =nums.length;
        quicksort(nums,0,len-1);

        for (int j : nums) {
            System.out.print(j + " ");
        }
        System.out.println();
        int k =4;
        kth_ele(nums,k);
    }
}
