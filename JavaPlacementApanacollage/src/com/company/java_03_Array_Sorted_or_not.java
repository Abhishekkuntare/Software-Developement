package com.company;

public class java_03_Array_Sorted_or_not {
    public static boolean array_is_sort_or_not(int []arr,int i){
    if(i==arr.length-1){
        return true;
    }

        if(arr[i]<arr[i+1]){
            return array_is_sort_or_not(arr,i+1);
        }else{
            return false;
        }
        // below one is the opposite condition of upper one
//        if(arr[i] >= arr[i+1]){
//            return false;
//        }
//        return array_is_sort_or_not(arr,i+1);
    }

    public static void main(String []args){
        int []arr = {1,2,3,4,5};
        System.out.println( array_is_sort_or_not(arr,0));
    }
}
