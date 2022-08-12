package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class java_59_Graphs {

    //add the edge in undirected graph
    public static void addEdge(ArrayList<ArrayList<Integer>>adj,int a,int b){
        adj.get(a).add(b);
        adj.get(b).add(a);
    }
    public static void printGraph(ArrayList<ArrayList<Integer>>adj){
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex " + i);
            System.out.print("head");

            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main (String[]args){
        //Implementation of taking input for adjacency matrix
//        Scanner sc = new Scanner(System.in);
//        int v= 5;//vertices
//        int e= 10;//edges
//        // create matrix of v+1 size
//        int a[][] =new int[v+1][v+1];
//        for(int i =0;i<e;i++){
//            int x,y;
//            System.out.println("Enter x: ");
//            x = sc.nextInt();
//            System.out.println("Enter y: ");
//            y = sc.nextInt();
//            a[x][y]=1;
//            a[y][x]=1;
       // }
        //Implementation of taking input for adjacency list
        int v = 5; //vertices
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>(v);

        //initialize array list for each
        for(int i =0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        //Adding edge one by one
        addEdge(adj,0,1);
        addEdge(adj,0,4);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,3);
        addEdge(adj,3,4);

        printGraph(adj);


    }
}
