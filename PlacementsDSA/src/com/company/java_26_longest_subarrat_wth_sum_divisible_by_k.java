package com.company;
import java.util.*;
public class java_26_longest_subarrat_wth_sum_divisible_by_k {

    static int longestSubarrWthSumDivByK(int arr[], int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int max_len = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            // to handle negavtive values as well
            int mod = ((sum % k) + k) % k;
            if (mod == 0) {
                max_len = i + 1;
            }
            if (!map.containsKey(mod)) { //if not contain the mod then put in the map
                map.put(mod, i); // 1st is key and 2nd is value
            }
            else {
                int sz = i - map.get(mod); // if contain the key then find the max of current index and key
                max_len = Math.max(max_len, sz);
            }
        }

        return max_len;
    }
        public static void main(String[] args)
        {
                int arr[] = {2, 7, 6, 1, 4, 5};
                int n = arr.length;
                int k = 3;

            System.out.println("Length = " + longestSubarrWthSumDivByK(arr, n, k));
        }
    }