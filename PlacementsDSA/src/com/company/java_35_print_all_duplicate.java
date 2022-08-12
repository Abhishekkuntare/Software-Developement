package com.company;
import java.io.*;
import java.util.*;

public class java_35_print_all_duplicate {
//
//        // Java program to map all duplicates
//        // from string using maps
//        static void printDups(String str)
//        {
//            Map<Character, Integer> map = new HashMap<>();
//            for (int i = 0; i < str.length(); i++) {
//                if(map.containsKey(str.charAt(i)))
//                    map.put(str.charAt(i) , map.get(str.charAt(i))+1);
//                else map.put(str.charAt(i),1);
//                //increase the map of characters by 1
//            }
//
//            for (Map.Entry<Character,Integer> mapElement : map.entrySet()) { //iterating through the unordered map
//                if (mapElement.getValue() > 1) //if the map of characters is greater then 1 then duplicate found
//                    System.out.println(mapElement.getKey() + ", map = " + mapElement.getValue());
//            }
//        }


    public static void printDups(String str){
        Map<Character,Integer>map = new HashMap<>();
        int n = str.length();
        for(int i =0;i<n;i++){
            if(map.containsKey(str.charAt(i))){ // if key is present then
                map.put(str.charAt(i),map.get(str.charAt(i))+1);// put the key and value
                //is will increment by one because they are repeating
            }else{
                map.put(str.charAt(i),1);//if is not present key then simply put the
                //key in map and value is constant which is 1
            }
        }
            //now we check the which value is more than 1 times those value are more than one
        //present that value's are our ans
        for(Map.Entry<Character,Integer>mapElement:map.entrySet()){
            if(mapElement.getValue()>1){
                System.out.print(mapElement.getKey()+" map: "+mapElement.getValue());
            }
            System.out.println();
        }
    }
        /* Driver program to test above function*/
        public static void main(String args[])
        {
            String str = "Abhishek";
            printDups(str);
        }
    }
