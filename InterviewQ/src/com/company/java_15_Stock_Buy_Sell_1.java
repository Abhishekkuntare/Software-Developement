package com.company;

import java.util.Arrays;

public class java_15_Stock_Buy_Sell_1 {

    public static int buy_sell_2(int[] arr){
        int profit = 0;
        for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i-1]){
            profit +=arr[i]-arr[i+1];
        }
        }return profit;
    }

    // O(N) and O(1);

    public static int buy_sell(int arr[]){
        int maxProfit = 0;
        int minSoFar = arr[0];
        for(int i=0;i<arr.length;i++){
            minSoFar = Math.min(minSoFar,arr[i]);
            int profit = arr[i]-minSoFar;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        //O(N) and space 0(N)
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;

        int[] rate = new int[n]; //create an array
        Arrays.fill(rate,0);

        //max till
        int maxTill = 0;
        for (int i =0;i<n;i++) {
          maxTill = Math.max(maxTill,arr[i]-rate[i]);
           // System.out.print(maxTill+" ");
        }
       // System.out.println(maxTill);

        int maxProfit =0;
        for(int i =0;i<n;i++){
        maxProfit =Math.max( maxProfit,maxTill - arr[i]);
        //    System.out.print(maxProfit+" ");
        }
   //  System.out.println("Max Profit: "+maxProfit);

       // System.out.println("Max Profit with O(N): "+buy_sell(arr));
        System.out.println(" Profit: "+buy_sell_2(arr));

    }
}
