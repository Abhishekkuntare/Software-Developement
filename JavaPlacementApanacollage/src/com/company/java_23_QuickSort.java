package com.company;


public class java_23_QuickSort {
    public static void swap(int []arr, int x ,int y){
        int  temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }
    public static int partition(int []arr,int lb,int ub){
            int pivot = arr[ub];
            int i = lb -1;
            for(int j=lb;j<ub;j++){
                if(arr[j]<pivot){
                    i++;
                   swap(arr,i,j);
                }
            }
            i++;
        swap(arr,i,ub);
        return i;
    }

    public static void quickSort(int []arr,int lb,int ub){
        if(lb<ub){
            int pi = partition(arr,lb,ub);
            quickSort(arr,lb,pi-1);
            quickSort(arr,pi+1,ub);
        }
    }


    public static void main(String[] args) {
            int []arr = {7,1,3,4,6,8,5,2};
        quickSort(arr,0,arr.length -1);
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}