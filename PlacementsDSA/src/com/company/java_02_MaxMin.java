
package com.company;

public class java_02_MaxMin {
    static class pair{
        int min;
        int max;
    }
    public static pair minmax(int []arr,int n){
        pair data = new pair();
        int i;
        if(n %2==0){ // if they are even numbers
            if(arr[0]>arr[1]){
                data.min = arr[1];
                data.max = arr[0];
            }else{
                data.min = arr[0];
                data.max= arr[1];
            }
            i =2;
        }else{
            data.min =arr[0];
            data.max =arr[1];
            i=1;
        }
        while(i<n-1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > data.max) {
                    data.max = arr[i];
                }
                if (arr[i] < data.min) {
                    data.min = arr[i];
                }
            }else{
                if(arr[i+1] >data.max){
                    data.max = arr[i+1];
                }
                if(arr[i+1]<data.min){
                    data.min = arr[i+1];
                }
            }
            i+=2;
        }
        return data;
    }
    public static void main(String[] args) {
        int []arr = {100,120,933,3943,938429};
        int arr_size = 5;
        pair ans = minmax(arr,arr_size);
        System.out.println(ans.max+"\n"+ans.min);
    }
}