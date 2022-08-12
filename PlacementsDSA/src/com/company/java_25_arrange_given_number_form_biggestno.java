package com.company;
import java.util.*;

public class java_25_arrange_given_number_form_biggestno {

        // The main function that prints the
        // arrangement with the largest value.
        // The function accepts a vector of strings
        static void printLargest(Vector<String> arr)
        {

            // A comparison function which is used by
            // sort() in printLargest()
            Collections.sort(arr, (X, Y) -> {

                // first append Y at the end of X
                String XY = X + Y;

                // then append X at the end of Y
                String YX = Y + X;

                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            });

            Iterator it = arr.iterator();

            while (it.hasNext())
                System.out.print(it.next());
        }

        // Driver code
        public static void main(String[] args)
        {
//            Vector<String> arr;
//            arr = new Vector<>();
//
            Vector<String> arr = new Vector<>();
            // output should be 60 548 546 54
            arr.add("54");
            arr.add("546");
            arr.add("548");
            arr.add("60");
            printLargest(arr);
        }
    }
