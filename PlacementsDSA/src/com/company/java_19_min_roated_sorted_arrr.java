package com.company;
import java.lang.*;

class Minimum {
    static int findMin(int arr[]){
        int low =0,high = arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;

            if(arr[mid] == arr[high]){
                high--;
            }
            else if (arr[mid]>arr[high]){ //going to right side of array
                low = mid+1;
            }
            else{
                high = mid;//cut the right array
            }
        }
        return arr[high];
}

    // Driver Program
    public static void main(String[] args)
    {
        int arr1[] = { 3,4,5,1,2 };
        System.out.println("The minimum element is " + findMin(arr1));
    }
}
