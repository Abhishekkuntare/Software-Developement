package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class java_24_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        //1.Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        //2.get Index
        int index = list.get(1);
        System.out.println(index+" ");

        //3.add and index
        list.add(0,33);
        System.out.println(list);

        //4.set Element
        list.set(0,100); // it means 0'th index change element into 100
        System.out.println(list);

        //5.Delete Element;
        list.remove(2);
        System.out.println(list);

        //6.Size of arrayList
        int size = list.size();
        System.out.println(size);

        //7.Loops
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        //8.Sorting Elements
        Collections.sort(list);
    }
}
