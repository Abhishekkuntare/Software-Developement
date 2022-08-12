package com.company;
import java.util.*;
// Class to represent a query range
class query{
    int L,R;
    query(int L,int R){
        this.L = L;
        this.R = R;
    }
}

public class java_29_mos_algorithm {
//
//         Prints sum of all query ranges. m is number of queries
//         n is the size of the array.
        static void mosAlgorithm(int a[],ArrayList<query> q, int m)
        {
            // One by one compute sum of all queries
            for (int i=0; i<m; i++)
            {
                // Left and right boundaries of current range
                int L = q.get(i).L, R = q.get(i).R;

                // Compute sum of current query range
                int sum = 0;
                for (int j=L; j<=R; j++)
                    sum += a[j];

                // Print sum of current query range
                System.out.println("Sum of [" + L + ", " + R + "] is " + sum);
            }
        }

        public static void main(String[] argv) {
            int[] a = {1, 1, 2, 1, 3, 4, 5, 2, 8};
            ArrayList<query> q = new ArrayList<>();
            q.add(new query(0, 4));
            q.add(new query(1, 3));
            q.add(new query(2, 4));
            int m = q.size();
            mosAlgorithm(a,q, m);


        }}