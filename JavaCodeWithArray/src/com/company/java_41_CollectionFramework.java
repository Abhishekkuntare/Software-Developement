package com.company;
import java.util.ArrayList;

public class java_41_CollectionFramework {
    public static void main (String[]args){
ArrayList<String>list = new ArrayList<>();// this is the generics syntax
ArrayList<String>list1 = new ArrayList<>(5);// this is the generics syntax
        list.add("Abhishek");
        list.add("Pravin");
        list.add("Meena");
        list.add("Aniket");
        list1.add("Kuntare");
        list.addAll(list1);
        for(String a:list){
            System.out.println(a);
        }
    }
}
