package com.company;
import java.util.*;

    public class java_04_Chocolate_Distribution_Problem {
         static int  findMinDiff(int []arr,int n,int m){
            if(m==0 || n==0)return 0;
            Arrays.sort(arr);
            if(n<m)return -1;
            int minDiff = Integer.MAX_VALUE;
            for(int i =0;i+m-1<n;i++){
                int diff = arr[i+m-1]-arr[i];
                if(diff<minDiff){
                    minDiff = diff;
                }
            }
            return minDiff;
        }
        public static void main(String[] args)
        {
            int arr[] = {7, 3, 2, 4, 9, 12, 56};
            int m = 3;//no of students
            int n = arr.length;
            System.out.println("Minimum difference is " + findMinDiff(arr, n, m));

        }
    }
