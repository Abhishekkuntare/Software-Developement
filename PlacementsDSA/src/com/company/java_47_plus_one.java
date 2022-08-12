package com.company;

public class java_47_plus_one {
    static int[]plus_one(int []arr){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int []ans =new int[arr.length+1];
        ans[0]=1;
        return ans;
    }
    public static void main(String[]args){
        int []arr = {1,9,9,9};
        int []ans =plus_one(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
