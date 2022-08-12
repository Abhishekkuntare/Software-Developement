package com.company;

public class java_30_Hepaify {

    public static void swap(int []arr,int i,int largest){
        int temp = arr[i];
        arr[i]= arr[largest];
        arr[largest] = temp;
    }

    public static void heapify(int []arr,int n ,int i ){
        int largest  = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest!=i){
         swap(arr,i,largest);
         heapify(arr,n,largest);
        }
    }

    public static void buildHeap(int []arr,int n){
        int startIndex = (n/2);
        for(int i = startIndex;i>=0;i--){
            heapify(arr,n,i);
        }
    }
    public static void DisplayHeap(int []arr){
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int []arr = {10,30,50,20,35,15};
        int n = arr.length;
        DisplayHeap(arr);
        buildHeap(arr,n);
        System.out.println();
        DisplayHeap(arr);
    }

}