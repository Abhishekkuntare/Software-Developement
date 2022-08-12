package com.company;

// Time complexcity O(N^2)
class BubbleSort{
    public  void sort(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public  void bubbleSort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

// Time complexcity O(N^2)
class SeletionSort extends BubbleSort{
   public void seletionSort(int[] arr){
    for(int i = 0;i<arr.length-1;i++){
        int min =i;
        for(int j = i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min = j ;
            }
        }
        int temp = arr[min];
        arr[min] =arr[i];
        arr[i] = arr[min];
    }
    }
}

class InsertionSort extends SeletionSort{
    void insertionSort(int[]arr){
        int ptr,temp;
        arr[0]  = -0;
        for(int i =2;i<arr.length;i++){
             temp = arr[i];
             ptr =i-1;
            while(temp < arr[ptr]){
                arr[ptr+1] = arr[ptr];
                ptr = ptr-1;
            }
            arr[ptr+1] = temp;
        }
    }
}

public class java_09_Sorting {
    public static void main(String[] args) {

        int[] arr ={1,55,439,11,22};

        BubbleSort bs = new BubbleSort();
        bs.sort(arr);
        System.out.println();
        bs.bubbleSort(arr);
        System.out.print("BubbleSort: ");
        bs.sort(arr);

        System.out.println();
        SeletionSort ss =new SeletionSort();
        System.out.print("Seletion Sort: ");
        ss.seletionSort(arr);
        ss.sort(arr);

        System.out.println();
        InsertionSort is = new InsertionSort();
        System.out.print("Insertion Sort: ");
        ss.seletionSort(arr);
        ss.sort(arr);
    }
}
