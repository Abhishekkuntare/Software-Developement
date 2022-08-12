package com.company;

public class java_13_majorityElement {
    public static void main(String[] args) {
        int []arr={1,1,1,2,3};
        int ansIndex = 0;
        int count =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[ansIndex]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                ansIndex =i;
                count=i;
            }
        }
        int lastCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[ansIndex]){
                lastCount++;
            }
        }
        System.out.println(arr[ansIndex]+" "+arr[lastCount]);
    }
}
