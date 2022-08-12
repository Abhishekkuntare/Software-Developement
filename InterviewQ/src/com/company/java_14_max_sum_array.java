package com.company;

public class java_14_max_sum_array {
    public static int Kadane(int []arr) {
        int maxSum = 0;
        int currSum =0;

        for(int i=0;i<arr.length;i++){
            currSum = currSum + arr[i];// add the current value in it
            if(currSum >maxSum){
                maxSum =currSum;
            }
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []arr={-5,1,-2,3,-1};
        System.out.println(Kadane(arr));
    }
}
