package com.company;

public class java_18_SearchElementInfinteSortedOrder {

    public static int binarySearchRecursive(int []arr,int low,int high,int key){
        if(low>high){
            return -1;
        }
        int mid = (low+(high))/2;
        if(key==arr[mid]){
            return mid;
        }
        if(key>arr[mid])
       return  binarySearchRecursive(arr,mid+1,high,key);

        return binarySearchRecursive(arr,low,mid-1,key);
    }

    public static int infinteSorted(int []arr,int key){
            int low =0;
            int high=1;
            while(arr[high]<key){
                low = high;
                high = 2*high;
            }
            return binarySearchRecursive(arr,low,high,key);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int key = 8;
      int ans =   infinteSorted(arr,key);
        System.out.println(ans);
    }
}
