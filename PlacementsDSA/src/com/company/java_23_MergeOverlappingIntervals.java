package com.company;// Java program to merge overlapping Intervals in
// O(n Log n) time and O(1) extra space

import java.util.Arrays;
import java.util.Comparator; // over all use for sorting

class Interval
{
    int start,end;
    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}

public class java_23_MergeOverlappingIntervals {

    // Function that takes a set of intervals, merges
    // overlapping intervals and prints the result
    public static void mergeIntervals(Interval[] arr)
    {
        // Sort Intervals in increasing order of
        // start time
        Arrays.sort(arr, Comparator.comparingInt(i -> i.start));

        int res = 0; // Stores res of last element
        // in output array (modified arr[])

        // Traverse all input Intervals
        for (int i=1; i<arr.length; i++)
        {
            // If this is not first Interval and overlaps
            // with the previous one
            if (arr[res].end >= arr[i].start)
            {
                // Merge previous and current Intervals
                arr[res].end = Math.max(arr[res].end, arr[i].end);
            }
            else {
                res++;
                arr[res] = arr[i];
            }
        }

        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i <= res; i++)
        {
            System.out.print("[" + arr[i].start + "," + arr[i].end + "]");
        }
    }

    public static void main(String args[]) {
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(5,10);
        arr[1]=new Interval(3,15);
        arr[2]=new Interval(18,30);
        arr[3]=new Interval(2,7);
        mergeIntervals(arr);
    }
}
