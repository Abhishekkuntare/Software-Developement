package com.company;

public class java_17_binarySearch {
    public static int binarySearch(int []arr,int key){
        int low = 0,high =arr.length-1,mid;
        while(low<=high){
            mid = (low+high)/2;
            if(key==arr[mid]){
                return mid;
            }
           else if(key>arr[mid]){
                low = mid+1;
            }
            else {
                high = mid -1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int []arr,int low,int high,int key){
        if(low>high){
            return -1;
        }
        int mid = (low+(high))/2;
        if(key==arr[mid]){
            return mid;
        }
        if(key>arr[mid])
         return    binarySearchRecursive(arr,mid+1,high,key);

        return binarySearchRecursive(arr,low,mid-1,key);
    }
    public static void main(String[]args){
            int []arr = {10,20,40,50,60,70};
            int key = 70;
             int ans =   binarySearchRecursive(arr,0,arr.length-1,key);
             System.out.println( "At index: "+ans );
             int ans1 =   binarySearch(arr,key);
             System.out.println( "At index: "+ans1 );
    }
}
