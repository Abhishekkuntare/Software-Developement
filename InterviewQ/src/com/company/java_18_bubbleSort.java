package com.company;

public class java_18_bubbleSort {
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

    public static void display(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public  static void bubbleSort(int []arr){
        boolean swapped = false;
        int n = arr.length;
        for(int i =0;i<n-1;i++){ //no. of passes
            for(int j=0;j<n-i-1;j++){ // no. of comparisons
                if(arr[j+1]<arr[j]){
                    swapped = true;
                    swap(arr,j+1,j);
                }
            }
            if(!swapped){ // not swapped then sorted array
                System.out.println("Sorted array");
                break;
            }
        }
    }
    public static void main(String[] args) {
    int []arr={71,4,5,6,2,2};
        display(arr);
        bubbleSort(arr);
        System.out.println();
        display(arr);
    }
}
