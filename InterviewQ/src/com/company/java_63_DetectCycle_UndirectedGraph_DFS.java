package com.company;

import java.util.ArrayList;

class detectCycle{
    public boolean isCycle(int v,ArrayList<ArrayList<Integer>>adj){
        boolean []visited=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dsf(i,adj,visited,-1);//-1 is the intial parent
                return true;
            }
        }
        return false;
    }
    // v is the starting point of graph

    public boolean dsf(int v,ArrayList<ArrayList<Integer>>adj,boolean []visited,int parent ){
        visited[v] =true;// mark as the ith index
        for(Integer neighbor:adj.get(v)){
            if(!visited[neighbor]){//if not visited neighbor then call dsf and visit it
                if(dsf(neighbor,adj,visited,v)){// why v because for neighbor v is parent
                    return true;
                }
            }
            else if (parent!=neighbor){// if neighbor is already visited check is equal to parent
                return true;
            }
        }
        return false;
    }
}

public class java_63_DetectCycle_UndirectedGraph_DFS {
    public static void main(String[] args) {

    }
}
