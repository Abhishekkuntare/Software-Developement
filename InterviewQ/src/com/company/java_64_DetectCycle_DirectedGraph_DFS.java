package com.company;
import java.util.ArrayList;

class detectCycleInUndirectedGraph{
    public boolean isCycle(int v,ArrayList<ArrayList<Integer>>adj){

        boolean []visited = new boolean[v];
        boolean []recurrsionStack = new boolean[v];//this is need for which
        // value are visited in this boolean array
        for(int i =0;i<v;i++){ // for loop used for, if disconnect components are also present ?
            if(!visited[i]){
                if(dfs(i,adj,visited,recurrsionStack)){
                    return true;
                }
            }
        }
        return false;
    }
    // v is the starting point of graph
    public boolean dfs(int v,ArrayList<ArrayList<Integer>>adj,boolean
        []visited,boolean[]recurrsionStack){
        visited[v]=true;
        recurrsionStack[v]=true;

        for(Integer neighbor: adj.get(v)){ // go for all neighbor of v
            if(!visited[neighbor]){ // if not visited then call again dsf func and visit it
                if(dfs(neighbor,adj,visited,recurrsionStack)){// if these neighbor say the cycle
                    // is present that case return true
                    return true;
                }
            }
            else if (recurrsionStack[neighbor]){//if recurrsion stack contain the neighbor so that
                // case cycle is present and return true
                return true;
            }
        }
        recurrsionStack[v] =false;//not get cycle so,  false it
        return false;

    }
}

public class java_64_DetectCycle_DirectedGraph_DFS {
    public static void main(String[] args) {

    }
}
