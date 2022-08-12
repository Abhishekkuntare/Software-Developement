package com.company;// Java program for the above approach
import java.io.*;
//Time Complexity: O(n)
//Space Complexity: O(1)
public class java_17_productOfArrayExceptSelf {

    public static long[] productExceptSelf(int a[], int n)
    {
        long prod = 1;
        long flag = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                flag++;
            else
                prod *= a[i];
        }
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            if (flag > 1) {
                arr[i] = 0;
            }
            else if (flag == 0)
                arr[i] = (prod / a[i]);

            else if (flag == 1 && a[i] != 0) {
                arr[i] = 0;
            }
            else
                arr[i] = prod;
        }
        return arr;
    }

    public static void main(String args[])
            throws IOException
    {
        int n = 4;
        int[] array = {1,2,3,4 };

        java_17_productOfArrayExceptSelf ob = new java_17_productOfArrayExceptSelf();
        long[] ans = new long[n];
        ans = ob.productExceptSelf(array, n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
