package com.company;

import java.util.LinkedList;

public class java_26_linkedList_CollectionFrameWork {
    public static  void main (String []args){
        LinkedList<Integer>list = new LinkedList<>();
        list.addFirst(4);
        list.addFirst(15);
        list.addLast(39);
        list.addLast(10);

        list.add(100); // it is like as addLast

        System.out.println(list);
        // list.clear();
        System.out.println(list.size());

        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);// here 2 is index
        System.out.println(list);
    }
}
