package com.company;
import java.util.Arrays;

public class java_73_Knapsack_ProblemDP
{
    public static void main(String[] args) {
            int w = 10;
            int n = 4;
            int[] val = {20, 30, 10, 50};
            int[] wt = {1, 3, 4, 6};

            int [][]mat= new int[n+1][w+1];

            //initializing with 0 rows
            for(int r=0;r<n+1;r++){
                mat[r][0]=0;
            }
            //initializing with 0 columns
            for(int c=0;c<w+1;c++){
                mat[0][c]=0;
            }
            //main login
            for(int item=1;item<=n;item++){
                for(int capacity=1;capacity<=w;capacity++){
                    int maxValWithoutCurr= mat[item-1][capacity];
                    int maxValWithCurr = 0;

                    int weightOfCurr=wt[item-1];
                    if(capacity>=weightOfCurr){
                        maxValWithCurr = val[item-1]; // set the maxValWithCurr from the array of val

                        int remaningCapacity = capacity -weightOfCurr;
                        maxValWithCurr +=mat[item-1][remaningCapacity];

                    }
                    mat[item][capacity] = Math.max(maxValWithoutCurr,maxValWithCurr);
                }
            }
        System.out.println(mat[n][w]); // Final answer
        System.out.println(Arrays.deepToString(mat)); // Visualization of the table

//        date and time
        //System.out.println(System.currentTimeMillis()/1000);
      //  System.out.println(System.currentTimeMillis()/1000/3600);
       // System.out.println(System.currentTimeMillis()/1000/3600/24);
       // System.out.println(System.currentTimeMillis()/1000/3600/24/365);
    }
}
