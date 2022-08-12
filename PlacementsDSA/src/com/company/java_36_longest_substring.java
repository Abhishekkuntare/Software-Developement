package com.company;
import java.util.*;

public class java_36_longest_substring {
        static int longestUniqueSubsttr(String s) {
            // Creating a set to store the last positions of occurrence
            HashMap<Character, Integer> map = new HashMap<>();
            int maximum_length = 0;

            // starting the initial point of window to index 0
            int start = 0;

            for(int end = 0; end < s.length(); end++)
            {
                // Checking if we have already map the element or not
                if(map.containsKey(s.charAt(end)))
                {
                    // If we have map the number, move the start pointer
                    // to position after the last occurrence
                    start = Math.max(start, map.get(s.charAt(end)) + 1);
                }
                // Updating the last map value of the character
                map.put(s.charAt(end), end);
                maximum_length = Math.max(maximum_length, end-start + 1);
            }
            return maximum_length;
        }

        // Driver code
        public static void main(String []args)
        {
            String s = "tmmzuxt";
            System.out.println("The input String is " + s);
            int length = longestUniqueSubsttr(s);
            System.out.println("The length of the longest non-repeating character substring is " + length);
        }
    }

