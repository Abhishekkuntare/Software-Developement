package com.company;
import java.util.Collections;
import java.util.PriorityQueue;
public class java_31_priorityQueue {
    public static void main(String[] args) {
      PriorityQueue<Integer>p = new PriorityQueue<>(); // By default min heap
//      PriorityQueue<Integer>p = new PriorityQueue<>(Collections.reverseOrder());//this is the max heap
        p.add(27);
        p.add(122);
        p.add(211);
        p.add(3);
        while(!p.isEmpty()){
            System.out.println(p .peek());
            p.poll();
        }
    }
}
