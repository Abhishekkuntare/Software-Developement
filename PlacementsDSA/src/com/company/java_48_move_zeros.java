package com.company;
public class java_48_move_zeros {
    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]!=0){
              nums[j++]=nums[i];
          }
        }
        for(;j<nums.length;j++){
            nums[j]=0;
            }
    }

    public static void main(String[] args) {
            int []arr = {1,3,12,0,0};
            moveZeroes(arr);
    }
    }
