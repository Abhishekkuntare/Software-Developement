package com.company;
import java.util.*;


    public class java_14_desending {
        public static void main(String[] args)
        {

            // Initializing the array
            Integer array[] = { 1, 2, 3, 4, 5 };

            // Sorting the array in descending order
            Arrays.sort(array, Collections.reverseOrder());

            // Printing the elements
            System.out.println(Arrays.toString(array));
        }

}
