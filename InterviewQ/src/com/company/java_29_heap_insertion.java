package com.company;

import java.util.Scanner;

class heapInsertion{
    public void hepify(int []arr, int i){
        int parent = (i/2); // find the parent
        if(arr[parent]>0){
            if(arr[i]>arr[parent]){
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
            hepify(arr,parent);
            }
        }
    }
    public int insertionheap(int []arr,int n,int key){
        n = n+1;// incerase the size of array
        arr[n-1] = key; // put the key in last of the array
        hepify(arr,n-1);//passing the parameteres like arr,size of array and last element
        return n;
    }
    public void display(int []arr,int n){
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
}

public class java_29_heap_insertion {
    public static void hepify(int []arr,int n,int i){
        int parent =(i)/2;
        if(arr[parent]>0){
            if(arr[i]>arr[parent]){
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
                hepify(arr,n,parent);
            }
        }

    }
    public static void display(int []arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static  int insertion(int []arr,int n,int key){
        n = n+1;//increase the size of heap
        arr[n-1]  =key; // put the key in the last
        hepify(arr,n,n-1);
        return n;
    }
    public static void main(String[] args) {
        int MAX = 1000;
        int[] arr = new int[MAX];

        // initializing some values
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 23;
        arr[3] = 32;
        arr[4] = 44;

        int n =5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item: ");
        int key = sc.nextInt();
        display(arr,n);
        n = insertion(arr,n,key);
        System.out.println();
        display(arr,n);
//        int max = 10;
//        int []arr = new int[max];
//           arr[0] = 5;
//           arr[1] =6;
//            arr[2] = 8;
//            arr[3] = 9;
//            arr[4] = 10;
//            int n =5;
//        System.out.println("Enter the item: ");
//        Scanner sc  = new Scanner(System.in);
//        int item = sc.nextInt();
//        heapInsertion hi = new heapInsertion();
//        hi.display(arr,n);
//        n = hi.insertionheap(arr,n,item);
//        System.out.println();
//        hi.display(arr,n);
    }
}
