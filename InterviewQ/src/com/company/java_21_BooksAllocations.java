package com.company;

public class java_21_BooksAllocations {
    public static boolean isFeasible(int []arr,int k ,int res){
        int student =1,sum =0;
        for(int i =0;i<arr.length;i++){
            if(sum+arr[i]>res){
                student++;
                sum =arr[i];
            }else{
                sum +=arr[i];
            }
        }
        return student<=k;
    }

    public static int minPages(int []arr,int k){
        int min = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.max(arr[i],min);
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max +=arr[i];
        }
        int res = 0;
        while(min<=max){
            int mid =(min+max)/2;
            if(isFeasible(arr,k,mid)){
                res =mid;
                max = mid -1;
            }else{
                min = mid +1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={10,20,5,5,5};
        int k = 3;
         int ans = minPages(arr,k);
        System.out.println(ans);

    }
}
