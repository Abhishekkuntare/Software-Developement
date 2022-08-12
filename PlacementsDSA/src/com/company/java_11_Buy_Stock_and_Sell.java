package com.company;

public class java_11_Buy_Stock_and_Sell {
    public static int buyStock(int []arr){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit= 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }else if (arr[i]-minPrice > maxProfit){
                maxProfit = arr[i]-minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int []arr = {7,1,5,3,6,4};
        System.out.print("Max Profit: "+ buyStock(arr));

    }
}