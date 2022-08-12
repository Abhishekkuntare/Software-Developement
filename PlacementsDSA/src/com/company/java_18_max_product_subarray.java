package com.company;
    class java_18_max_product_subarray {
        public static int maxProduct(int[] nums) {

            int n = nums.length;
            int max_ending_here = nums[0];
            int min_ending_here = nums[0];
            int max_so_far = nums[0];

            for (int i = 1; i < n; i++) {
                int temp = Math.max(Math.max(nums[i], nums[i] * max_ending_here), nums[i] * min_ending_here);
                min_ending_here = Math.min(Math.min(nums[i], nums[i] * max_ending_here), nums[i] * min_ending_here);
                max_ending_here = temp;
                max_so_far = Math.max(max_so_far, max_ending_here);
            }
            return max_so_far;
        }
        public static void main(String[] args)
        {
            int[] arr = { 1, -2, -3, 0, 7, -8, -2 };
            int n = arr.length;
            System.out.printf("Maximum Sub array product is %d",maxProduct(arr));
        }
    }
