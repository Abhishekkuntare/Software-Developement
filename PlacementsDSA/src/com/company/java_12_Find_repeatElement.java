package com.company;

import java.util.Arrays;

public class java_12_Find_repeatElement
{
static int []repeating_missing(int []arr){
    int a =0,b=0;
    for(int i =0;i<arr.length;i++){
        if(arr[Math.abs(arr[i]-1)]<0){
            a = Math.abs(arr[i]);
        }
        else {
            arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
        }
    }
    for(int i =0;i<arr.length;i++){
        if(arr[i]>0){
            b = i+1;
            break;
        }
    }
    int []ans = new int[2];
    ans[0] = a;
    ans[1] = b;
    return ans;
}
    public static void main(String[] args) {
            int []arr = {3,1,2,5,3};
        System.out.println(Arrays.toString(repeating_missing(arr)));
    }
}