package com.company;
import java.util .*;


public class java_33_longest_common_prefix {
        public static String longpev(String[] a) {
//            int size = a.length;
//            System.out.println(size);
//
//            /* if size is 0, return empty string */
//            if (size == 0)
//                return "";
//
//            if (size == 1)
//                return a[0];
//
//            /* sort the array of strings */
//            Arrays.sort(a);
//            for(String s:a)
//                System.out.print(s+" ");
//            System.out.println();
//
//            /* find the minimum length from first and last string */
//            int end = Math.min(a[0].length(), a[size - 1].length());
//            System.out.println(end);
//            System.out.println(a[0]+" "+a[size-1]);
//
//		/* find the common prefix between the first and
//		last string */
//            int i = 0;
//            while (i < end && a[0].charAt(i) == a[size - 1].charAt(i)) {
//                i++;
//            }
//
//            String pre = a[0].substring(0, i);
//            return pre;
//        }
            int  n = a.length;
            //if string array contain 1 or 0 char
            if(n==0)return "";
            if(n==1)return a[0];
            Arrays.sort(a);
            int end = Math.min(a[0].length() , a[n-1].length());
            int i =0;
            while (i < end && a[0].charAt(i)==a[n-1].charAt(i)){
                i++;
            }
            String ans = a[0].substring(0,i);
            return ans;
        }

        /* Driver Function to test other function */
        public static void main(String[] args) {
            String[] input = {"flower","flow","flight"};
            System.out.println("The longest Common Prefix is : " +
            longpev(input));
        }
    }