package com.company;

public class java_02_nonRepeatingElements {
    public static void main(String[] args) {
//        int []arr={5,4,1,4,3,5,1};
    //        int res = 0;
    //        for(int i=0;i<arr.length;i++){
    //        res = arr[i]^res;
    //        }
    //        System.out.println(res);


        int []arr={5,4,1,4,3,5,1,2};

        // two non repeating elements:
        int res = 0,temp=0;
        for(int i=0;i<arr.length;i++){
            res =arr[i]^res;
        }
        for(int i=0;i<arr.length;i++){
            if ((arr[i] & 1) ==0) {
            temp = arr[i];
            }
            res = res^temp;
        }
        System.out.println(res);
        System.out.println(temp);
    }
}
