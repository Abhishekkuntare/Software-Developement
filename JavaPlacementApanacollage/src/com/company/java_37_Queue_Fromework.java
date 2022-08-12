package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class java_37_Queue_Fromework
{
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();
      Queue<Integer>q = new ArrayDeque<>();
      q.add(3);
      q.add(6);
      q.add(9);
      q.add(12);
      while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
      }
    }
}
