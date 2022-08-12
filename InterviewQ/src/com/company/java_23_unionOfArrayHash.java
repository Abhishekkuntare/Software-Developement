package com.company;

import java.util.HashSet;
import java.util.Set;

public class java_23_unionOfArrayHash {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int a[] ={5,10,15,5};
        int b[]={10,15,4};

        for(int arr1:a){
            set.add(arr1);

        }   for(int arr2:b){
            set.add(arr2);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
