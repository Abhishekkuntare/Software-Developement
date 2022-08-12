package com.company;

public class java_27_HeapSort {
    public static void DisplayHeap(int []arr){
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
    public static void swap(int []arr,int i,int largest){
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest]=temp;
    }
    //hepaify
    public static void heapify(int []arr,int n, int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }
        if(r<n&& arr[r]>arr[largest]){
            largest = r;
        }
        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }
    //build heap
    public static void buildHeap(int []arr,int n){
        int startIndex = (n/2);
        for(int i =startIndex;i>=0;i--){
            heapify(arr,n,i);
        }
    }

    //heap sort
    public static void heapSort(int []arr,int n ){
        for(int i=n;i>=0;i--){
            swap(arr,0,i); // here the last element is sorted
            heapify(arr,i-1,0);//then call for i-1 means 6-1 =5,because we sort the 6 th element
        }
    }
    public static void main(String[] args) {
        int []arr={4,5,6,7,2,5,5};
        int n = arr.length;
        DisplayHeap(arr);

        System.out.println();

        buildHeap(arr,n);
        DisplayHeap(arr);

        heapSort(arr,n-1);
       System.out.println();
        DisplayHeap(arr);
    }
    }

