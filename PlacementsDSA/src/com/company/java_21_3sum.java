package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class java_21_3sum {
    public static List<List<Integer>> sum_3(int []num ){
        Arrays.sort(num);
        List<List<Integer >> res = new LinkedList<>();//we can have all the unique
            //triplet stored and return as ans
        for(int i =0;i<num.length-2;i++){
            if(i==0 ||(i>0 && num[i]!=num[i-1])){ // current index of i is not equal to prev index

                //find low and high
                int low = i+1,high = num.length-1,sum = 0-num[i]; // initially -1
                while(low<high){
                    if(num[low]+num[high] == sum){
                        res.add(Arrays.asList(num[i],num[low],num[high]));//we get our ans here

                        //now we can not take those value who same data in current ones
                        //ex: current low =-1 and next low will be -1 so, we do not take those value
                        // we can increment our counter until we not get different value same goes for high also
                        while(low<high && num[low] == num[low+1]){
                            low ++;
                        }
                        while(low<high && num[high]== num[high-1]){
                            high ++;
                        }
                        // but the next i'th value is not equal to low as well as high current value
                        // that time we increment only ones our low and high
                        low ++;high++;
                    }else if (num[low]+num[high]<sum){
                        low++;
                    }else {
                        high--;
                    }

                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        Set<Integer> s = new HashSet<>();

        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n-1;j++){
                for(int k = j+1;k<n-1;k++){
                   if(arr[i]+arr[j]+arr[k] ==0){
                       s.add(arr[i]);
                       s.add(arr[j]);
                       s.add(arr[k]);
                   }
                }
            }
        }
        Iterator it = s.iterator();
        // next,hasNext
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        int a [] = new int[3];

    }
}
