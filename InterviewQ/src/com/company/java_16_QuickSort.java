package com.company;

// O(nlogn) best case, worst case O(N^2)
public class java_16_QuickSort{
    public static void display(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
    public static int partition(int []arr,int l,int r){
        int pivot =arr[l];
        int i =l;
        int j = r;
        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,l); //right element and left element
        return j;
    }
    public static void quickSort(int []arr,int l,int r){
        if(l<r){
            int pivot = partition(arr,l,r);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,r);
        }
    }
    public static void main(String[] args) {
            int []arr= {5,6,23,67,734,236,7,44,6,1};
             display(arr);
             quickSort(arr,0,arr.length-1);
             System.out.println();
             display(arr);
    }
        }
