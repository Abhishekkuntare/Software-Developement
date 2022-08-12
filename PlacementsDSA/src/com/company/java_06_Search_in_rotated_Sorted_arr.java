package com.company;

import javax.xml.stream.events.StartDocument;

//class Solu {
//    public int search(int[] nums, int target) {
////        class Solution {
////            public int search(int[] nums, int target) {
////                int start = 0, end = nums.length, mid;
////
////                while (start <= end) {
////
////                    mid = (start + end) / 2;
////                    if (nums[mid] == target) {
////                        return nums[mid];
////                    } else if (target > nums[mid]) {
////                        start = mid + 1;
////                    } else {
////                        end = mid - 1;
////                    }
////                }
////                return -1;
////
////            }
////        }
////        return target;
////    }
//
//}
public class java_06_Search_in_rotated_Sorted_arr {
    public static int search(int[] nums, int target) {
        int low = 0,high = nums.length-1;
      while(low<=high){
          int mid = (low+high)/2;
          if(nums[mid]==target)return nums[mid];
          if(nums[low]<nums[mid]){
              if(target>=nums[low] && target<nums[mid]){
                  high = mid-1;
              }else{
                  low = mid+1;
              }
          }else{
              if(target>nums[mid] && target<=nums[high]){
                  low = mid+1;
              }else{
                  high=mid-1;
              }
          }

      }
      return -1;
    }
    public static void main(String[] args) {
       int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(search(nums,target));
//        Solu sl = new Solu();
//        System.out.println( sl.search(nums,target));
    }
}
