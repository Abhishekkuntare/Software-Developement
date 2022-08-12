package com.company;


//Time coplexcity n(log n);
public class java_21_MergeSort {

    public static  void printMerge(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Merge(int []arr,int lb,int mid,int ub) {
        int idx1 = lb;
        int idx2= mid+1;
        int x =0;
        int []narr = new int[ub - lb+1];

        //Time complexsity O(n)
        while(idx1<=mid && idx2<=ub){
            if(arr[idx1]<=arr[idx2]){
                narr[x++]=arr[idx1++];
            }else{
                narr[x++]=arr[idx2++];
            }
        }

        while (idx1<=mid){
            narr[x++]=arr[idx1++];
        }

        while(idx2<=ub){
        narr[x++]=arr[idx2++];
        }

     for(int i=0,j=lb;i<narr.length;i++,j++){
         arr[j]=narr[i];
     }
    }


    public static void MergeSort(int []arr,int lb,int ub){

        //Time complextiy O(log n)
        if(lb>=ub){
            return;
        }
            int mid = lb+(ub-lb)/2;
            MergeSort(arr,lb,mid);
            MergeSort(arr,mid+1,ub);
            Merge(arr,lb,mid,ub);

    }
    public static void main(String[] args) {
        int []arr = {6,5,4,3,3,1,0};
        int len = arr.length;
        printMerge(arr);
        MergeSort(arr,0,len-1);
        System.out.println();
        printMerge(arr);

    }
}
