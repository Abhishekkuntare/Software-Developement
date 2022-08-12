package com.company;

public class java_05_MaximumSubarray
{
    public static int kadane(int []arr, int n){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i =0;i<n;i++){
            curr_sum +=arr[i];
            if(curr_sum>max_sum){
                max_sum= curr_sum;
            }
            if(curr_sum<0){
                curr_sum =0;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int []arr = {5,4,-1,7,8};
        int n =arr.length;
        System.out.print(kadane(arr,n));
    }
}