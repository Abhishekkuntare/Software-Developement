package com.company;
import java.util.HashSet;
import java.util.Iterator;

public class java_50_Hashing {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();

        //adding
        set.add(55);
        set.add(88);
        set.add(23);
        set.add(64);

        System.out.println(set);

        //Search - Contains
        if(set.contains(3)){
            System.out.println("Set contains 3");
        }
        //if not set contains 6
        if(!set.contains(6)){
            System.out.println("Yes");
        }

        //Delete
        set.remove(4);
        if(set.contains(4)){
            System.out.println("Yes");
        }else{
            System.out.println("No- It is deleted");
        }

        //Size
        System.out.println("Size: "+ set.size());

        //Iterator
            Iterator it = set.iterator();
            // next,hasNext
            while(it.hasNext()){
                System.out.println(it.next());
            }
    }
}
