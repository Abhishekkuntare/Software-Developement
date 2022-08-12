package com.company;
class ReverseArray{
    public void reverse(int []arr,int start, int end){
        if(start>=end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,start+1,end-1);
    }
    public void printArray(int arr[]){
        for (int j : arr) System.out.print(j + " ");
        System.out.println("");
    }
}


public class java_01_Reverse {
    public static void main(String[] args) {
        int []arr  = {1,2,3};
        int start=0,end=2;
        while (start < end)
        {
          int  temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}