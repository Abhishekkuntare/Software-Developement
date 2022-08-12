package com.company;

import java.util.HashSet;
import java.util.Set;

public class java_22_countDistinctElementsHash {

       public static void main(String[] args) {
           Set<Integer>set =new  HashSet<>();
           int[]a ={1,1,2};
           for(int hash:a){
               set.add(hash);
           }
           System.out.println(set.size());
           System.out.println(set);
    }

}
