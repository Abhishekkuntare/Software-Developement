package com.company;
import java.util.Arrays;
import java.util.HashSet;

public class java_03_ContainsDuplicate {
    public static void main(String[]args){
        int arr[] = {1,2,3,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(true);
            }
        }
    }
}
