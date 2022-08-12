package com.company;

import java.util.LinkedList;
import java.util.Queue;

class graph{
    private int v; // no of vertices
    private LinkedList<Integer>adj[]; // adjacency list

    //create the constructor
    graph(int vSize){
        v = vSize;
        adj = new LinkedList[vSize];
        for(int i=0;i<vSize;++i){
            adj[i]= new LinkedList(); // create a array list 0 ,1 ,2 ,3
        }
    }
    //function to add an edge into a graph
    void addEdge(int v,int e){
        adj[v].add(e);
    }

    void BFS(int source,boolean visited[]){
        //1.create the boolean array with default value is false
        Queue<Integer>q = new LinkedList<>();
        //add the 1st value by us
        visited[source]=true;
        q.add(source);
        while(!q.isEmpty()){
            int curr = q.poll();
            System.out.print(curr+" ");
            //get the adjacent element of curr value
            for(int adjvalue:adj[curr]){ // passing the linked list array
                if(visited[adjvalue]==false){
                    visited[adjvalue] =true;
                    q.add(adjvalue);
                }
            }
        }
    }

    public int  BFSDis(){
        int count =0;
        boolean[]visited = new boolean[v+1];
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                BFS(i,visited);
                count++;
            }
        }
        return count;
    }
}

public class java_61_BSF_NoSourceAnd_UndirectedGraphs {
    public static void main(String[] args) {

        graph g=new graph(5); //passing the size of vertices
        // 0 , 1, 2 ,3  these are vertices

        g.addEdge(1, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        System.out.println("Breadth first traversal, starting from at index: ");
        int ans =  g.BFSDis();
        System.out.println();
        System.out.println("No of connected component in undirected Graph: "+ans );

    }
}
