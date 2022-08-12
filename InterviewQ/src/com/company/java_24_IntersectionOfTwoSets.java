package com.company;

import java.util.Arrays;

public class java_24_IntersectionOfTwoSets {
    static int []intersecting (int []nums1,int []nums2){
    int l1 = nums1.length;
    int l2 = nums2.length;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i=0,j=0,k=0;
    while(i<l1 &&j<l2){
        if(nums1[i]<nums2[j]){ //increment the i value because the array is sorted then i'th value is not present in nums2 array
            i++;
        }else if (nums1[i]>nums2[j]){
            j++;
        }else{
            nums1[k]=nums1[i];
            i++;k++;j++;
        }
    }
    return Arrays.copyOfRange(nums1,0,k);
    }
    public static void main(String[] args) {
        int []nums1={4,9,5};
        int []nums2={9,4,9,8,4};
        int [] a= intersecting(nums1,nums2);
        for(int i:a){
            System.out.println(i+" ");
        }
//        HashSet<Integer>set = new HashSet<>();
//        for(int x:a){
//            set.add(x);
//        }
//        int count =0;
//        for(int x:b){
//            if(set.contains(x)){
//                count++;
//                set.remove(x);
//                System.out.print(x+" ");
//            }
//        }
//        System.out.println();
//        System.out.print(count);



    }
}
