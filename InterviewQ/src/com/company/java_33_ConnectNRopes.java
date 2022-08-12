package com.company;

import java.util.PriorityQueue;

public class java_33_ConnectNRopes {
public static int ConnectNRopes(int []arr,int n){
    PriorityQueue<Integer>pq = new PriorityQueue<>();
    for(int i=0;i<n;i++){
        pq.add(arr[i]);
    }
    int ans =0;
    while(pq.size()>1){
        int first =pq.poll();
        int second = pq.poll();
        int sum=first+second;
        ans +=sum;
        pq.add(sum);
    }
    return ans;
}
    public static void main(String[] args) {
    int []arr={2,5,4,8,6,9};
    int n =arr.length;
    int ans =  ConnectNRopes(arr,n);
        System.out.println(ans );

    }
}
